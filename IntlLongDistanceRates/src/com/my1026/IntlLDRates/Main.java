package com.my1026.IntlLDRates;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//https url we are reading from
		//Data location for Intl LD rates
		//data from public website
		String https_url = "https://www.att.com/shop/wireless/international/long-distance.cdataProvider.html";
		
		String grd = GetRateData.getRateData(https_url);
		FormatRateData frd = new FormatRateData(grd);
		CountryRatesMap crm = new CountryRatesMap(frd);
		
		Iterator<?> it = crm.entrySet().iterator();
	    while (it.hasNext()) {
	        @SuppressWarnings("unchecked")
			Map.Entry<String, CountryRates> country = (Map.Entry<String, CountryRates>)it.next();
	        System.out.println(country.getKey() + " = " + country.getValue().wc_WirelessRate + ", " + country.getValue().ppu_WirelessRate + ", " + country.getValue().wc_WirelineRate + ", " + country.getValue().ppu_WirelineRate);
	        
	    }
	}

}
