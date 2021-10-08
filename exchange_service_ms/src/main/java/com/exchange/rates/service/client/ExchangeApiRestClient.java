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

@Component
public class ExchangeApiRestClient {
	
	private static final Logger LOG = LoggerFactory.getLogger(ExchangeApiRestClient.class);
	
	@Autowired
	@Qualifier("exchangeRestTemplate")
	RestTemplate exchangeRestTemplate;
	
	@Value("${historic.exchange.rest.uri}")
	protected String historicExchangeUri;
	
	@Value("${access.key.value}")
	protected String accessKey;
	
	public ExchangeRates exchangeRestcallerDetails(String date,String base) throws Exception {
		    LOG.info("====>Start exchangeRestcallerDetails call******");
		 
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
		
			HttpEntity<Object> request = new HttpEntity<Object>(headers);
			LOG.info(" request :{}",request.toString());
			ResponseEntity<ExchangeRates> response = null;
			ExchangeRates body = null;
 		    Map<String, String> urlParams = new HashMap<String, String>();
		try {
			urlParams.put("date", date);
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(historicExchangeUri)
					.queryParam("access_key", accessKey).queryParam("base", base);
			LOG.info("builder.toUriString() value : {}", builder.toUriString());
			String url = URLDecoder.decode(builder.toUriString(), "UTF-8");
			LOG.info("url value : {}", url);
			response = exchangeRestTemplate.exchange(url, HttpMethod.GET, request, ExchangeRates.class, urlParams);

			LOG.info("exchangeUri response code : {}", response.getStatusCodeValue());
			if (response.getStatusCodeValue() == 200) {
				LOG.info("Response code is 200");
				body = response.getBody();
				LOG.info("exchangeUri response returned : {}", body.toString());
				return body;
			}
			return body;

		} catch (Exception ex) {
			LOG.error("exception caught while calling historic exchanhe API");
		}
		return body;
	}
	
	
	
}
