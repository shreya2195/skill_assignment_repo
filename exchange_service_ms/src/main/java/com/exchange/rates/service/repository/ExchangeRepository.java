package com.exchange.rates.service.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.exchange.rates.service.entity.ExchangeRates;
@Transactional
public interface ExchangeRepository extends CrudRepository<ExchangeRates, String>{
	
	  @Query("select c from ExchangeRates c where c.date <=:startDate and c.date >=:endDate")
	  List<ExchangeRates> findByDate(@Param("startDate") String startDate,@Param("endDate") String endDate);
	  
}
