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
import com.exchange.rates.service.entity.ExchangeRates;
import com.exchange.rates.service.exception.DBEntityServiceException;
import com.exchange.rates.service.repository.ExchangeRepository;
import com.exchange.rates.service.util.ExchangeConstant;

@RestController 
public class ExchangeController {

	private static final Logger LOG = LoggerFactory.getLogger(ExchangeController.class);

	@Autowired
	ExchangeApiRestClient exchangeApiRestClient;
	@Autowired
	ExchangeRepository exchangeRepository;

	
	/**This rest Call is responsible to fetch the details from Exchange Rate and to insert 
	 * the records to H2 database and it will display rates of GBP/USD/HKD  currency.
	 * @param date
	 * @param base
	 * @param accessKey
	 * @return
	 * @throws Exception
	 */
	
	@GetMapping("/getExchangeRates/historicRates/{date}/{base}/{accessKey}")
	public Object getHistoricExchangeRates(@PathVariable("date") String date,@PathVariable("base") String base,@PathVariable("accessKey") String accessKey) throws Exception   
	{  
	    LOG.info("====>Inside getHistoricExchangeRates call");
	    ExchangeRates rates = null;
	    ExchangeRates allRates = null;
	    int flag=0;
	    rates=exchangeApiRestClient.exchangeRestcallerDetails(date, base, accessKey,flag);
	    flag++;
	    allRates=exchangeApiRestClient.exchangeRestcallerDetails(date, base, accessKey,flag);
		exchangeRepository.save(allRates);
		return rates;  
	} 
	
	
	
	/**This rest Call is responsible to fetch the details from Exchange Rate and  will return only GBP/EUR currency
	 * @param specificDate
	 * @param base
	 * @param accessKey
	 * @return
	 * @throws Exception
	 */
	
	@GetMapping("/fetchExchangeRates/{specificDate}/{base}/{accessKey}")
	public Object fetchSpecificDateRates(@PathVariable("specificDate") String specificDate,@PathVariable("base") String base,@PathVariable("accessKey") String accessKey) throws Exception   
	{  
	    LOG.info("====>Inside fetchSpecificDateRates call");
	    LOG.info("fetching record for Date :{} ",specificDate);
	    ExchangeRates allRates = null;
	    int flag=2;
	    allRates=exchangeApiRestClient.exchangeRestcallerDetails(specificDate, base, accessKey,flag);
		return allRates;  
	} 
	

	
	/**
	 * This API will fetch the records from Database between a given time range.
	 * @param startDate 
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/fetchExchangeRates/monthly/{startDate}/{endDate}")
	public Object fetchExchangeRates(@PathVariable("startDate") String startDate,
			@PathVariable("endDate") String endDate) throws Exception {
		LOG.info("====>Inside fetchExchangeRates call");
		List<ExchangeRates> rates = null;
		try {
			rates = (List<ExchangeRates>) exchangeRepository.findByDate(startDate, endDate);
			if (rates.size() == 0) {
				throw new DBEntityServiceException(ExchangeConstant.ERROR_CODE_400,ExchangeConstant.ERROR_MESSAGE_400);
			}
		} catch (Exception e) {
			throw new DBEntityServiceException(ExchangeConstant.ERROR_CODE_500, ExchangeConstant.ERROR_MESSAGE_500);
		}
		return rates;
	}
	
	
	
	/**This API is responsible to fetch the records from DB between current Date to any Date.
	 * @param date
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/fetchExchangeRates/date/{date}")
	public Object fetchExchangeRatesWithDate(@PathVariable("date") String date) throws Exception {
		LOG.info("====>Inside fetchExchangeRatesWithDate call");
		List<ExchangeRates> rates = null;
		try {
			rates = (List<ExchangeRates>) exchangeRepository.findByDate(Calendar.getInstance().toString(), date);
			if (rates.size() == 0) {
				throw new DBEntityServiceException(ExchangeConstant.ERROR_CODE_400,ExchangeConstant.ERROR_MESSAGE_400);
			}
		} catch (Exception e) {
			throw new DBEntityServiceException(ExchangeConstant.ERROR_CODE_500, ExchangeConstant.ERROR_MESSAGE_500);
		}
		return rates;
	}
}
