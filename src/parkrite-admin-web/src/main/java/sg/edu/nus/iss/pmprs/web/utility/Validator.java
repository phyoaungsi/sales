package sg.edu.nus.iss.pmprs.web.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import antlr.StringUtils;

public class Validator {

	public static boolean isValidEmailAddress(String email) {
		String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[_A-Za-z0-9-]+)";
		return email.matches(regex);
	}

	public static boolean validatePostal(String input) {
		try {

			if (input.isEmpty()) {
				return false;
			}

			if (input.length() != 6) {
				return false;
			}

			char[] post = input.toCharArray();
			for (int i = 0; i < post.length; i++) {
				if (!Character.isDigit(post[i])) {
					return false;
				}
			}

			// http://postal-codes.net/singapore/
			// First 2 digit is using upto 82 in singapore for posatl code.
			int first2digit = Integer.parseInt(input.substring(0, 2));
			if (first2digit > 82) {
				return false;
			}

			// jumped through all the hoops and postal code is okie.
			return true;

		} catch (Exception ex) {
			return false;
		}

	}
	
	public static boolean isNumeric(String number){  
		boolean isValid = false;  
		  
		/*Number: A numeric value will have following format: 
		         ^[-+]?: Starts with an optional "+" or "-" sign. 
		     [0-9]*: May have one or more digits. 
		    \\.? : May contain an optional "." (decimal point) character. 
		    [0-9]+$ : ends with numeric digit. 
		*/  
		  
		//Initialize reg ex for numeric data.   
		String expression = "^[-+]?[0-9]*\\.?[0-9]+$";  
		CharSequence inputStr = number;  
		Pattern pattern = Pattern.compile(expression);  
		Matcher matcher = pattern.matcher(inputStr);  
		if(matcher.matches()){  
		isValid = true;  
		}  
		return isValid;  
	}
	
	/** isPhoneNumberValid: Validate phone number using Java reg ex. 
	* This method checks if the input string is a valid phone number. 
	* @param email String. Phone number to validate 
	* @return boolean: true if phone number is valid, false otherwise. 
	*/  
	public static boolean isPhoneNumberValid(String phoneNumber){  
	boolean isValid = false;  
	/* Phone Number formats: (nnn)nnn-nnnn; nnnnnnnnnn; nnn-nnn-nnnn 
	    ^\\(? : May start with an option "(" . 
	    (\\d{3}): Followed by 3 digits. 
	    \\)? : May have an optional ")"  
	    [- ]? : May have an optional "-" after the first 3 digits or after optional ) character.  
	    (\\d{3}) : Followed by 3 digits.  
	     [- ]? : May have another optional "-" after numeric digits. 
	     (\\d{4})$ : ends with four digits. //comment this ends
	     [0-9]* ends with more than one.
	 
	         Examples: Matches following phone numbers: 
	         (123)456-7890, 123-456-7890, 1234567890, (123)-456-7890 
	 
	*/  
	//Initialize reg ex for phone number.   
	//String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
	String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?[0-9]*$";  
	CharSequence inputStr = phoneNumber;  
	Pattern pattern = Pattern.compile(expression);  
	Matcher matcher = pattern.matcher(inputStr);  
	if(matcher.matches()){  
	isValid = true;  
	}  
	return isValid;  
	}
	
	
	/** isSSNValid: Validate Social Security number (SSN) using Java reg ex. 
	* This method checks if the input string is a valid SSN. 
	* @param email String. Social Security number to validate 
	* @return boolean: true if social security number is valid, false otherwise. 
	*/  
	 public static boolean isSSNValid(String ssn){  
	boolean isValid = false;  
	 /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx: 
	         ^\\d{3}: Starts with three numeric digits. 
	    [- ]?: Followed by an optional "-" 
	    \\d{2}: Two numeric digits after the optional "-" 
	    [- ]?: May contain an optional second "-" character. 
	    \\d{4}: ends with four numeric digits. 
	 
	        Examples: 879-89-8989; 869878789 etc. 
	*/  
	  
	//Initialize reg ex for SSN.   
	String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";  
	CharSequence inputStr = ssn;  
	Pattern pattern = Pattern.compile(expression);  
	Matcher matcher = pattern.matcher(inputStr);  
	if(matcher.matches()){  
	isValid = true;  
	}  
	return isValid;  
	}  
	 
	 
	 public static void isPostalCode(String value,String fieldLabel,ArrayList<String> messages){
		if(value!=null && !value.matches("^(\\s*\\d{6}\\s*)(,\\s*\\d{6}\\s*)*,?\\s*$"))
			{
			  messages.add(fieldLabel + " is invalid");
			};
	 }
	 
	 public static void isEmpty(String value,String fieldLabel,ArrayList<String> messages){
			if(value==null || value.isEmpty())
				
				
				{
				  messages.add(fieldLabel + " should not be empty");
				};
		 }
	
	 public static void isEmail(String value,String field,ArrayList<String> messages){
			if(value!=null && ! value.matches  ("(\\w[-._\\w]*\\w@\\w[-._\\w]*\\w\\.\\w{2,3})"))
				{
				  messages.add(field +" - Invalid email address");
				};
		 }
	 public static void isPhoneNumber(String value,String field,ArrayList<String> messages){
			if(value!=null && !value.matches("^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?"))
				{
				  messages.add(field +" - Invalid phone number");
				};
		 }
	
	 public static void isNric(String value,String field,ArrayList<String> messages){
			if(value!=null && ! value.matches("^[SFTG]\\d{7}[A-Z]$"))
				{
				  messages.add(field +" - NRIC is invalid format");
				};
		 }
}
