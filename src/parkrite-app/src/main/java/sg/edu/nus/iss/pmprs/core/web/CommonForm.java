package sg.edu.nus.iss.pmprs.core.web;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

public abstract class CommonForm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6240218302548733803L;

	public abstract void convertFormToDao(CommonForm f);
	public abstract void convertDaoToFrom(CommonEntity ent);
public void reset(){
		
		Method[] methods=this.getClass().getMethods();
		Method setter;
		for(Method m:methods)
		{
			setter=m;
				
				
				String setterName=setter.getName();
				
				if(setterName.contains("set") && m.getParameterTypes().length==1)
				{
			
			
				//getter always null 
				Object o=new Object();;
				try {
					Class<?>[] c=m.getParameterTypes();
					
					
							//Class.forName(c[0].getName()).getConstructor().newInstance(o);
				Object[] args=new Object[1];
				args[0]=null;
				
				if(c[0].getName().equals("int"))
				{
					args[0]=0;
				}
				else if(c[0].getName().equals("boolean"))
				{
					args[0]=false;
				}
				
							m.invoke(this, args);
							
				} catch (IllegalArgumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		
		}
		
	}
	
	}
	
	public Object convertFormToVo(Object obj)
	{
	   
		Method[] methods=this.getClass().getMethods();
		
		Method getter,setter;
		
		for(Method m:methods)
		{
			getter=m;
				Class<?> returnType=null;
				
				String getterName="";
				if(getter.getName().substring(0, 3).equals("get"))
				{
					getterName=getter.getName();
					returnType=getter.getReturnType();
			
				
				
				String setterName=getterName.replace("get", "set");
				//getter always null 
				Object returnedObj;
				try {
					returnedObj = getter.invoke(this);
					
					setter=obj.getClass().getMethod(setterName, returnType);
					if(setter.getParameterTypes()[0].equals(returnType))
					{
					
				
					setter.invoke(obj, returnedObj);
					}
				
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
		return obj;
	}

}
