package sg.edu.nus.iss.pmprs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static final String MOBILE_DATE_FORMAT = "dd/MM/yyyy";
	private static final String MOBILE_DATE_ONLY_FORMAT = "MMM dd, yyyy";
	private static final String MOBILE_TIME_FORMAT = "HH:mm";

	public static String converToDateString(Date d)
	{
		DateFormat df=new SimpleDateFormat(MOBILE_DATE_FORMAT);
		return df.format(d);
		
	}

	public static Date convertDateFromMobile(String dateString) throws ParseException
	{
		DateFormat df=new SimpleDateFormat(MOBILE_DATE_FORMAT);
		return df.parse(dateString);
		
	}

	public static String convertToMobileTimeOnly(Date d)
	{
		DateFormat df=new SimpleDateFormat(MOBILE_TIME_FORMAT);
		return df.format(d);
		
	}

	public static Date convertDateOnlyFromMobile(String dateString) throws ParseException
	{
		DateFormat df=new SimpleDateFormat(MOBILE_DATE_ONLY_FORMAT);
		return df.parse(dateString);
		
	}
	
	public static String convertToMobileDateOnly(Date d)
	{
		DateFormat df=new SimpleDateFormat(MOBILE_DATE_ONLY_FORMAT);
		return df.format(d);
		
	}

	public static Date convertTimeOnlyFromMobile(String dateString) throws ParseException
	{
		DateFormat df=new SimpleDateFormat(MOBILE_TIME_FORMAT);
		return df.parse(dateString);
		
	}
}
