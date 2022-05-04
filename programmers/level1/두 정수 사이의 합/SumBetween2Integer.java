package com.coding.upgrade.level1;

public class SumBetween2Integer {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		long answer = 0;
		if(a == b) {
			answer = a;
		} 
		
		int start = 0;
		int end = 0;
		if(a < b) {
			start = a;
			end = b;
		} else {
			start = b;
			end = a;
		}
		
		long sum = 0;
		for(;start <= end; start++) {
			sum += start;
		}
		
		answer = sum;
		
		System.out.println(answer);
	}

}
