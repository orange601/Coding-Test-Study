package com.coding.upgrade.level1;

public class Remainder {
	public static void main(String[] args) {
		int n = 10;
		int result = 0;
		for(int i = 2; i < n; i++) {
			int remainder = n%i;
			if(remainder == 1) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
