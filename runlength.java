package com.ios;

public class runlength {
	public static String runLengthEncoding(String text) {
	    String encodedString = "";
	    
	    int count =1;
	    for (int i = 0; i < text.length(); i++) {
	    	
	        if (i+1< text.length() && text.charAt(i) == text.charAt(i + 1)) {
	        	
	        
	            count++;}
	        
	        else {
	            encodedString = encodedString.concat(Integer.toString(count)).concat(Character.toString(text.charAt(i)));
	            count = 1;
	        }
	    }
	    return encodedString;
	}

	public static void main(String[] args) {
		String s="aaaccsassdddd";
		String username=runLengthEncoding(s);
		System.out.println(username);
				

	}

}
