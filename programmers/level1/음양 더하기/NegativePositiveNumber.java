package com.coding.upgrade.level1;

public class NegativePositiveNumber {
	public static void main(String[] args) {
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		
		int answer = 0;
		for(int i = 0; i < absolutes.length; i++) {
			int absolute = absolutes[i];
			boolean sign = signs[i];
			if(!sign) {
				absolute *= -1;
			}
			
			answer += absolute;
		}
		
		System.out.println(answer);
	}

}
