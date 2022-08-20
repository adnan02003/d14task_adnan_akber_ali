package com.d14.util;

public class Util {

	private static final String STUPID = "stupid";
	private static final String REPLACE_STUPID = "s*****!!!";
	
	public static String convertLowerCase(String text) {
		return text.toLowerCase();
	}
	
	public static String convertUpperCase(String text) {
		return text.toUpperCase();
		
	}
	public static String stupidRemover(String text) {
		
		int size = text.length();
		if (size == 0)
		{
			return "";
		}
		StringBuilder stringBuilder = new StringBuilder();
		
		String[] words = text.split(" ");
		
		for (int i=0;i<words.length; i++) {
			if(words[i].startsWith(STUPID)) {
				stringBuilder.append(REPLACE_STUPID).append(" ");
			}else {
				stringBuilder.append(words[i]).append(" ");
			}
		}
		
		return stringBuilder.toString();
		
		//return text.replaceAll(STUPID, REPLACE_STUPID);
	
	}
	public static String duplicateRemover(String text) {
		
		int size = text.length();
		if (size == 0)
		{
			return "";
		}
		String[] words = text.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		
		if (words.length==1)
		{
			return text;
		}
		
		for (int i=0;i<words.length; i++) {
			if(i>0 && words[i].equals(words[i-1])) {
				continue;
			}else {
				stringBuilder.append(words[i]).append(" ");
			}
		}
		
		return stringBuilder.toString();
	}
	
}
