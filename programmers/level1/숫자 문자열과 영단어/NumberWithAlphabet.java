package com.coding.upgrade.level1;

public class NumberWithAlphabet {
	static String[] txtnos = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	public static void main(String[] args) {
		String s = "one4seveneight";
		for(String txtno : txtnos) {
			if(s.contains(txtno)) {
				s = s.replace(txtno, convertTextToNum(txtno));
			}
		}
		
		System.out.println(Long.parseLong(s));
	}
	
	static String convertTextToNum(String text) {
		String result = "";
		for(int i = 0; i < txtnos.length; i++) {
			if(text.equals(txtnos[i])) {
				result = String.valueOf(i);
				break;
			}
		}
		return result;
	}

}
