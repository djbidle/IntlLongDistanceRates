package com.my1026.IntlLDRates;

import java.util.ArrayList;

public class FormatRateData extends ArrayList<String[]>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormatRateData(String input){
		String[] stringArray = input.split("@");
		String[] country_rates;
		
		for(int i = 0; i < stringArray.length; i++){
			country_rates = stringArray[i].split("~");
			this.add(country_rates);
		}
		
	}
}

