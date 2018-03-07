package sg.edu.nus.iss.pmprs.web.utility;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtils {

	static String commonDateFormate="dd/MM/yyyy";
	
	public static Date getDate(String deliverDate) {
		// TODO Auto-generated method stub
		SimpleDateFormat df=new SimpleDateFormat(commonDateFormate);
		try {
			return df.parse(deliverDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static BigDecimal getAmount(String amount){
		BigDecimal bd=new BigDecimal(amount);
		return bd;
	}
	
	
	public static Integer getInt(String integer){
		return Integer.parseInt(integer);
	}
	
	
	
}
