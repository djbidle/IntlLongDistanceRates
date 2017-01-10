package com.my1026.IntlLDRates;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;

public class GetRateData {

	public static String getRateData(String https_url){
		
		URL url;
		HttpsURLConnection connection = null;
		  
	    //sets proxy for connect, needed if behind proxy
	    //System.setProperty("https.proxyHost", "");
	    //System.setProperty("https.proxyPort", "8080");
	      
	    //creates new https connection
	    try {
	    	url = new URL(https_url);
		    connection = (HttpsURLConnection)url.openConnection();
		  			
		    //dump all the content - not needed
		    
		
		//error handling    
	    } catch (MalformedURLException e) {
		   e.printStackTrace();
	    } catch (IOException e) {
		   e.printStackTrace();
	    }
	   return readContent(connection);
	}
	 
	private static String readContent(HttpsURLConnection connection){
		
		BufferedReader br;
		StringBuilder sb;
		String input;
		
		//proceed if connection is open
		if(connection != null){
					
			try{
				br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				sb = new StringBuilder();
				
				while ((input = br.readLine()) != null){
					sb.append(input);
				}
				br.close();
			//Prints string
			//System.out.print(sb);
			return sb.toString();	
				
			} catch (IOException e) {
				e.printStackTrace();
			}
					
		}
	return "";			
	}
}
