package sg.edu.nus.iss.pmprs.web.utility;

import sg.edu.nus.iss.pmprs.core.common.PropertiesFile;

public class ParkriteProperties {

	
	
	private static final String TEMPLATE_BASE = "template.base";

	public static String getTemplateBasePath()
	{
		return PropertiesFile.getString(TEMPLATE_BASE);
	}
	
}
