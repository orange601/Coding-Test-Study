package com.coding.upgrade.level1;

import java.util.Arrays;

public class Buget {
	public static void main(String[] args) {
		int[] d = {1,2,3,4,5};
		int budget = 9;
		
		int sum = 0;
		int answer = 0;
		for(int i = 0; i < d.length; i++) {
			budget -= d[i];
			if(budget < 0) {
				break;
			}
			answer++;
		}
		
		System.out.println(answer);
		
	}

}
