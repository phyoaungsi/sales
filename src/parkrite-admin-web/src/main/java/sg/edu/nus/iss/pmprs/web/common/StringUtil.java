package sg.edu.nus.iss.pmprs.web.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public static String getInvRef(){
		
		String prefix="INV";
		SimpleDateFormat df=new SimpleDateFormat("ddMMyyyHHmmss");
		String format=df.format(new Date());
		return prefix+format;
	}
}
