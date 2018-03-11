package sg.edu.nus.iss.pmprs.web.utility;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.actions.order.CreateOrderAction;

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
	
	public static BigDecimal getAmount(String amount, CommonAction action,String fieldName){
		BigDecimal bd=null;
		try{
		 bd=new BigDecimal(amount);
		}catch(Exception e)
		{
			action.addActionError(action.getText("cannot.convert.to.number",fieldName));
		}
		return bd;
	}
	
	public static BigDecimal getAmount(double amount, CommonAction action,String fieldName){
		BigDecimal bd=null;
		try{
		 bd=new BigDecimal(amount);
		}catch(Exception e)
		{
			action.addActionError(action.getText("cannot.convert.to.number",fieldName));
		}
		return bd;
	}
	
	public static Integer getInt(String integer){
		return Integer.parseInt(integer);
	}
	
	
	
}
