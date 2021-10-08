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

@Component
public class ExchangeApiRestClient2 {
	
	private static final Logger LOG = LoggerFactory.getLogger(ExchangeApiRestClient2.class);
	
	@Autowired
	@Qualifier("exchangeRestTemplate")
	RestTemplate exchangeRestTemplate;
	
	@Value("${historic.exchange.rest.uri}")
	protected String historicExchangeUri;
	
	@Value("${access.key.value}")
	protected String accessKey;
	
	public Object exchangeRestcallerDetails2(String date,String base) throws Exception {
		     LOG.info("Start exchangeRestcallerDetails2 call");
		 
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
			HttpEntity<Object> request = new HttpEntity<Object>(headers);
			LOG.info(" request2 :{}",request.toString());
			ResponseEntity<Object> response = null;
			Object body = null;
 		    Map<String, String> urlParams = new HashMap<String, String>();
		try {
			urlParams.put("date", date);
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(historicExchangeUri)
					.queryParam("access_key", accessKey).queryParam("base", base);
			LOG.info("builder.toUriString() value : {}", builder.toUriString());
			String url = URLDecoder.decode(builder.toUriString(), "UTF-8");
			LOG.info("url2 value : {}", url);
			response = exchangeRestTemplate.exchange(url, HttpMethod.GET, request, Object.class, urlParams);
			LOG.info("exchangeUri response code : {}", response.getStatusCodeValue());
			if (response.getStatusCodeValue() == 200) {
				LOG.info("Response code is 200");
				body = response.getBody();
				LOG.info("exchangeUri response returned : {}", body.toString());
				return body;
			}
			return body;

		} catch (Exception ex) {
			LOG.error("exception caught while calling historic exchange API");
		}
		return body;
	}
	
	
	
}
