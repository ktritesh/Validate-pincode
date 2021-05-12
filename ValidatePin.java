package com.bridgelabz.validatepin;

import java.util.regex.*;

public class ValidatePin {
	
	public static boolean isValidPinCode(String pinCode) {
		
		String regex = "^[0-9]{3}\\s{0,1}[0-9]{3}$";
		
        Pattern p = Pattern.compile(regex);
        
        if (pinCode == null) {
            return false;
        }
        
        Matcher m = p.matcher(pinCode);
        return m.matches();
	}

	public static void main(String[] args) {
		
		// Test Case 1
        String num1 = "400088";
        System.out.println( num1 + " : " + isValidPinCode(num1));
        
		// Test Case 2
        String num2 = "A400088";
        System.out.println( num2 + " : " + isValidPinCode(num2));
        
		// Test Case 3
        String num3 = "A400088B";
        System.out.println( num3 + " : " + isValidPinCode(num3));
        
		// Test Case 4
        String num4 = "400 088";
        System.out.println( num4 + " : " + isValidPinCode(num4));
        
	}

}