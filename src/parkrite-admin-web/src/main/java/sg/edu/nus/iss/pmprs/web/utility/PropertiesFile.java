package sg.edu.nus.iss.pmprs.web.utility;

import java.io.IOException;
import java.util.Properties;

import org.apache.struts2.ServletActionContext;

import sg.edu.nus.iss.pmprs.constants.PropertyKey;

public class PropertiesFile {
	
	private static Properties prop = new Properties();
	
	public static Properties load()
	{ 
    	try {
               //load a properties file
    		prop.load(ServletActionContext.getServletContext().getResourceAsStream("/WEB-INF/parkrite.properties"));
    	} catch (IOException ex) {
    		
    		ex.printStackTrace();
        }	
    	return prop;	
	}

	public static String getString(String key)
	{
		load();
		return prop.getProperty(key);
	}
	
	public static String getString(PropertyKey key)
	{
		load();
		return prop.getProperty(key.getName());
	} 
	
}
