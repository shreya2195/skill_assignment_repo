package com.exchange.rates.service.entity;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="EXCHANGE_RATES")
@Component
public class ExchangeRates {

	@Id
	@Column( name = "DATE" , length=50)
	public String date;
	
	@Column( name = "BASE" , columnDefinition ="TEXT ",length=50)
	private String base;

	@Embedded
    private Rates rates;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBase() {
		return base;
	}
	

	public Rates getRates() {
		return rates;
	}

	public void setRates(Rates rates) {
		this.rates = rates;
	}

	public void setBase(String base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "ExchangeRates [date=" + date + ", base=" + base + ", rates=" + rates + "]";
	}

	

}
