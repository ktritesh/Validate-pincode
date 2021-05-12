package com.bridgelabz.validatepin;

import java.util.regex.*;

public class ValidatePin {
	
	public static boolean isValidPinCode(String pinCode) {
		String regex = "[0-9]{6}";
		
        Pattern p = Pattern.compile(regex);
        
        if (pinCode == null) {
            return false;
        }
        
        Matcher m = p.matcher(pinCode);
        return m.matches();
	}

	public static void main(String[] args) {
		
		// Test Case 1:
        String num1 = "400088";
        System.out.println( num1 + " : " + isValidPinCode(num1));
        
	}

}
