package sg.edu.nus.iss.pmprs.core.business;

import org.apache.log4j.Logger;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;


public abstract class BusinessLogic<T> {
		
	private T result;
	private CommonVo vo;
	private String[] stringParam;
	private Integer[] intParam;
	protected Logger logger=Logger.getLogger(this.getClass());
	public void process()
	{
		doValidation();
		execute(vo);
	}
   
	
	public void setParamter(CommonVo vo)
	{
		this.vo=vo;
		
	}
	protected abstract void execute(CommonVo vo);
	protected abstract void doValidation();
    public T getResult()
    {
    	return result;
    }
    public void setResult(T result)
    {
    	this.result=result;
    }


	public String[] getStringParam() {
		return stringParam;
	}


	public void setStringParam(String... stringParam) {
		this.stringParam = stringParam;
	}


	public Integer[] getIntParam() {
		return intParam;
	}


	public void setIntParam(Integer... intParam) {
		this.intParam = intParam;
	};
	
	public CommonVo getParamter()
	{
		return vo;
		
	}
}
