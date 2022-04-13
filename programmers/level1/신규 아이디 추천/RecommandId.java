package com.coding.upgrade.level1;

public class RecommandId {
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		// 1. 대문자 > 소문자
		new_id = new_id.toLowerCase();
		// 2. 특수문자 제거 
		new_id = new_id.replaceAll("[^a-zA-Z0-9-_.]", "");
		new_id = new_id.replaceAll("[.]{2,}", ".");
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		
		if (new_id.equals("")){
			new_id += "a";
        }
		
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("[.]$","");
		}
		
		if(new_id.length() <= 2) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);
            }
		}
		
		System.out.println(new_id);
		
	}
}
