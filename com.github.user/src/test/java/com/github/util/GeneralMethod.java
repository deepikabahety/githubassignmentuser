package com.github.util;

import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneralMethod {
	
	/**
	 * funciton is use to convet the date format
	 * @param inputFormat - input format
	 * @param date - which need to convert to output format
	 * @param outputFormat - output format
	 * @return - date in output foramt
	 * @throws ParseException
	 */
	
	public String ConvertDateFormat(String inputFormat,String date,String outputFormat) throws ParseException
	{
		DateFormat srcFormat = new SimpleDateFormat(inputFormat);
		Date inputDate = srcFormat.parse(date);
	
		DateFormat destForamt = new SimpleDateFormat(outputFormat);
		String outputDate = destForamt.format(inputDate);
		
		return outputDate;
	}
	
	/**
	 * function is use to count the no of digit
	 * @param value - number
	 * @return - no of digit of value
	 */
	public int DigitCount(int value)
	{

		int count=0; 

		while(value !=0) 
		{
			value /=10; 
			count++; 
		}
		return count;
	}
	
	/** 
	 * function is use to convert the int value to K,M,b
	 * @param value - int value which need to convert
	 * @param noOfDigit - no of digit of vaule
	 * @return - String - converted value
	 */
	
	
	  public String convertValue(int value, int noOfDigit)
	  { 
		  DecimalFormat df = new DecimalFormat("#");
		  df.setRoundingMode(RoundingMode.HALF_UP);
		  
		  Double valueInDouble = Double.valueOf(value);
		  
		  String returnValue = "";
	  
		  if(noOfDigit>3 && noOfDigit<7)
		  {
			  valueInDouble = valueInDouble/10E2;
			  returnValue = df.format(valueInDouble)+"k";
		  }
		  
		  else if(noOfDigit>6 && noOfDigit<10)
		  {	
			  valueInDouble = valueInDouble/10E5;
			  returnValue = df.format(valueInDouble)+"m";
		  }
		  
		  else if(noOfDigit>9 && noOfDigit<13)
		  {	
			  valueInDouble = valueInDouble/10E8;
			  returnValue = df.format(valueInDouble)+"b";
		  }
		  return returnValue;
	  }
}

