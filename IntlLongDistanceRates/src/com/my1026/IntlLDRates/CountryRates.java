package com.my1026.IntlLDRates;

public class CountryRates {
	
	double wc_WirelineRate = 0;
	double wc_WirelessRate = 0;
	double ppu_WirelineRate = 0;
	double ppu_WirelessRate = 0;
	
	public CountryRates(double wc_WirelineRate, double wc_WirelessRate,
			double ppu_WirelineRate, double ppu_WirelessRate) {
		super();
		this.wc_WirelineRate = wc_WirelineRate;
		this.wc_WirelessRate = wc_WirelessRate;
		this.ppu_WirelineRate = ppu_WirelineRate;
		this.ppu_WirelessRate = ppu_WirelessRate;
	}
	public double getWc_WirelineRate() {
		return wc_WirelineRate;
	}
	public double getWc_WirelessRate() {
		return wc_WirelessRate;
	}
	public double getPpu_WirelineRate() {
		return ppu_WirelineRate;
	}
	public double getPpu_WirelessRate() {
		return ppu_WirelessRate;
	}
	
	
}	