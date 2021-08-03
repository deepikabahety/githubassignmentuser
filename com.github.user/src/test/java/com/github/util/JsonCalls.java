package com.github.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class JsonCalls {
	
	public String HttpGetCall(String url) throws IOException
	{
		StringBuffer result = new StringBuffer();
		
		CloseableHttpClient client = HttpClients.createDefault();
		
		try
		{
			HttpGet request = new HttpGet(url);
		
			request.addHeader("accept","application/vnd.github.v3+json");
			
			CloseableHttpResponse response = client.execute(request);
			
			int responseCode = response.getStatusLine().getStatusCode();
			
			if(responseCode == 200)
			{
				BufferedReader reader  = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
				String line;
				
				while((line = reader.readLine()) != null)
				{
					result.append(line);
				}
				
				client.close();
			}
		}
		//If username is invaid
		catch(IllegalArgumentException i)
		{
			return result.toString();
		}
		return result.toString();
	}
}
