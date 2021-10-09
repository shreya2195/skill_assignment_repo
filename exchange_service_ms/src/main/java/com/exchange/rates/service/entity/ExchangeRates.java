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

	@Column( name = "SUCCESS" , columnDefinition = "boolean default false")
	private Boolean success;
	
	@Column( name = "TIMESTAMP")
	private long timestamp;
	
	@Column( name = "HISTORICAL" ,columnDefinition = "boolean default false")
	private Boolean historical;

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

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}


	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getHistorical() {
		return historical;
	}

	public void setHistorical(Boolean historical) {
		this.historical = historical;
	}

	@Override
	public String toString() {
		return "ExchangeRates [date=" + date + ", base=" + base + ", success=" + success + ", timestamp=" + timestamp
				+ ", historical=" + historical + ", rates=" + rates + "]";
	}


}
