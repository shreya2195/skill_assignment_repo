package com.exchange.rates.service.entity;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;
@Embeddable
public class Rates {

	private Double GBP;

    private Double USD;

    private Double HKD;

	public Double getGBP() {
		return GBP;
	}
	@JsonProperty("GBP")
	public void setGBP(Double GBP) {
		this.GBP = GBP;
	}

	public Double getUSD() {
		return USD;
	}
	@JsonProperty("USD")
	public void setUSD(Double USD) {
		this.USD = USD;
	}
	@JsonProperty("HKD")
	public Double getHKD() {
		return HKD;
	}

	public void setHKD(Double HKD) {
		this.HKD = HKD;
	}

	@Override
	public String toString() {
		return "Rates [GBP=" + GBP + ", USD=" + USD + ", HKD=" + HKD + "]";
	}
    
    
}
