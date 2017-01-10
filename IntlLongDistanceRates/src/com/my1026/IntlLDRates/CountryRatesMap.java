package com.my1026.IntlLDRates;

import java.util.HashMap;

public class CountryRatesMap extends HashMap<String, CountryRates>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CountryRatesMap(FormatRateData frd){ 
		
		for (String[] strObj : frd){ 
			String[] temp = strObj[1].split(";");
			this.put(strObj[0], new CountryRates(Double.valueOf(temp[0]),Double.valueOf(temp[1]),Double.valueOf(temp[2]),Double.valueOf(temp[3]))); 
		} 
	}
}
