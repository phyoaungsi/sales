package sg.edu.nus.iss.pmprs.actions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import sg.edu.nus.iss.pmprs.constants.PropertyKey;
import sg.edu.nus.iss.pmprs.core.common.FileReader;
import sg.edu.nus.iss.pmprs.core.common.PropertiesFile;
import com.opensymphony.xwork2.Action;

//@Action(value="/virtualfolder/images", 
//results=@Result(name = "success", type = "stream", params =
//{
//    "contentType",
//    "image/jpeg",
//    "inputName",
//    "inputStream",
//    "contentDisposition",
//    "filename=document.jpg",
//    "bufferSize",
//    "1024"
//}))
public class ImageAction implements Action  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6831866635235411109L;
	private String fileName;
	public String execute()
	{
		System.out.print("IMAGE ACTION1");
	
		return SUCCESS;
	}
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public InputStream getInputStream() {
		
			FileReader f=new FileReader();
			 String basePath=PropertiesFile.getString(PropertyKey.IMAGE_PATH.getName());
			byte[] input=f.readByte(basePath+File.separator+this.getFileName());
			ByteArrayInputStream s= new ByteArrayInputStream(input);
		return s;
		
	     
	}


	public void setInputStream(InputStream inputStream) {
	}


	
	

}
