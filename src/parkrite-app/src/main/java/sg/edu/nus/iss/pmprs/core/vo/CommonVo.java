package sg.edu.nus.iss.pmprs.core.vo;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.core.web.CommonForm;

public class CommonVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1942191201598776506L;
	
	private String loggedInUserId;
	
	public void copyFields(Object e)
	{
	   
		Method[] methods=this.getClass().getMethods();
		Method getter,setter;
		for(Method m:methods)
		{
			getter=m;
				Class<?> type=getter.getReturnType();
				
				String getterName=getter.getName();
				
				if(getterName.contains("get")){
				String setterName=getterName.replace("get", "set");
				//getter always null 
				Object o;
				try {
					o = getter.invoke(e);
				
					setter=e.getClass().getMethod(setterName, type);
				
					setter.invoke(this, o);
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalArgumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			
		}
	}

	public String getLoggedInUserId() {
		return loggedInUserId;
	}

	public void setLoggedInUserId(String loggedInUserId) {
		this.loggedInUserId = loggedInUserId;
	}

}
