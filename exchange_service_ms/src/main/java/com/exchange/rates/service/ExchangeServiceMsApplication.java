package com.exchange.rates.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan({"com.exchange.rates.service.*"})
public class ExchangeServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeServiceMsApplication.class, args);
	}

	@Bean(name="exchangeRestTemplate")
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
