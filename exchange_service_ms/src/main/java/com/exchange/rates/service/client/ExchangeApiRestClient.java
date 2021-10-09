package com.exchange.rates.service.client;



import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.exchange.rates.service.entity.ExchangeRates;
import com.exchange.rates.service.exception.ExchangeRateServiceException;
import com.exchange.rates.service.util.ExchangeConstant;

@Component
public class ExchangeApiRestClient {
	
	private static final Logger LOG = LoggerFactory.getLogger(ExchangeApiRestClient.class);
	
	@Autowired
	@Qualifier("exchangeRestTemplate")
	RestTemplate exchangeRestTemplate;
	
	@Value("${historic.exchange.rest.uri}")
	protected String historicExchangeUri;
	
	@Value("${symbols.value}")
	protected String symbols;
	
	@Value("${gbp.eur.values}")
	protected String eurSymbols;
	
	/**
	 * This API call is responsible to fetch the records from Exchange Rate
	 * @param date
	 * @param base
	 * @param accessKey
	 * @param flag
	 * @return
	 * @throws Exception
	 */
	public ExchangeRates exchangeRestcallerDetails(String date,String base,String accessKey,int flag) throws Exception {
		    LOG.info("====>Start exchangeRestcallerDetails call******");
		 
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
		
			HttpEntity<Object> request = new HttpEntity<Object>(headers);
			LOG.info(" request :{}",request.toString());
			ResponseEntity<ExchangeRates> response = null;
			ExchangeRates body = null;
			UriComponentsBuilder builder=null;
 		    Map<String, String> urlParams = new HashMap<String, String>();
		try {
			urlParams.put("date", date);
			if (flag == 0) {
				builder = UriComponentsBuilder.fromUriString(historicExchangeUri).queryParam(ExchangeConstant.ACCESSKEY, accessKey)
						.queryParam(ExchangeConstant.BASE, base).queryParam(ExchangeConstant.SYMBOLS, symbols);
			} else if (flag == 2)
			{
				builder = UriComponentsBuilder.fromUriString(historicExchangeUri).queryParam(ExchangeConstant.ACCESSKEY, accessKey)
						.queryParam(ExchangeConstant.BASE, base).queryParam(ExchangeConstant.SYMBOLS, eurSymbols);	
			}
			else {
				builder = UriComponentsBuilder.fromUriString(historicExchangeUri).queryParam(ExchangeConstant.ACCESSKEY, accessKey)
						.queryParam(ExchangeConstant.BASE, base);
			}
			LOG.info("builder.toUriString() value : {}", builder.toUriString());
			String url = URLDecoder.decode(builder.toUriString(), ExchangeConstant.ENCODE);
			LOG.info("url value : {}", url);
			response = exchangeRestTemplate.exchange(url, HttpMethod.GET, request, ExchangeRates.class, urlParams);

			LOG.info("exchangeUri response code : {}", response.getStatusCodeValue());
			if (response.getStatusCodeValue() == 200) {
				LOG.debug("Response code is 200");
				body = response.getBody();
				LOG.debug("exchangeUri response returned : {}", body.toString());
				return body;
			}
			return body;

		} catch (Exception ex) {
			LOG.error("exception caught while calling historic exchange API");
			throw new ExchangeRateServiceException(ExchangeConstant.ERROR_CODE_1000, ExchangeConstant.ERROR_MESSAGE_1000);
		}
	}
	
	
	
}
