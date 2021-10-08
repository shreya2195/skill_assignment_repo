package com.exchange.rates.service.controller;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.rates.service.client.ExchangeApiRestClient;
import com.exchange.rates.service.client.ExchangeApiRestClient2;
import com.exchange.rates.service.entity.ExchangeRates;
import com.exchange.rates.service.repository.ExchangeRepository;

@RestController 
public class ExchangeController {

	private static final Logger LOG = LoggerFactory.getLogger(ExchangeController.class);

	@Autowired
	ExchangeApiRestClient exchangeApiRestClient;
	@Autowired
	ExchangeApiRestClient2 exchangeApiRestClient2;
	@Autowired
	ExchangeRepository exchangeRepository;
	
	@GetMapping("/fetchExchangeRates/{specificDate}/{base}")
	public Object fetchSpecificDateRates(@PathVariable("specificDate") String specificDate,@PathVariable("base") String base) throws Exception   
	{  
	    LOG.info("====>Inside fetchSpecificDateRates call");
	    LOG.info("fetching record for Date :{} ",specificDate);
	    Object rates=exchangeApiRestClient2.exchangeRestcallerDetails2(specificDate,base);
		return rates;  
	}  
	
	@GetMapping("/getExchangeRates/historicRates/{date}/{base}")
	public Object getHistoricExchangeRates(@PathVariable("date") String date,@PathVariable("base") String base) throws Exception   
	{  
	    LOG.info("====>Inside getHistoricExchangeRates call");
	    ExchangeRates rates=exchangeApiRestClient.exchangeRestcallerDetails(date,base);
		exchangeRepository.save(rates);
		return rates;  
	} 
	
	@GetMapping("/fetchExchangeRates/monthly/{startDate}/{endDate}")
	public Object fetchExchangeRates(@PathVariable("startDate") String startDate,@PathVariable("endDate") String endDate) throws Exception   
	{  
	    LOG.info("====>Inside fetchExchangeRates call");
		List<ExchangeRates> rates =(List<ExchangeRates>) exchangeRepository.findByDate(startDate, endDate);
		return rates;
	}  
	
	@GetMapping("/fetchExchangeRates/date/{date}/")
	public Object fetchExchangeRatesWithDate(@PathVariable("date") String date) throws Exception   
	{  
	    LOG.info("====>Inside fetchExchangeRatesWithDate call");
		List<ExchangeRates> rates =(List<ExchangeRates>) exchangeRepository.findByDate(Calendar.getInstance().toString(),date);
		return rates;
	} 
}
