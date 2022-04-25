package com.coding.upgrade.level1;

/**
 * 소수 만들기
 * */
public class PrimeNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4}; // 1,2,7,6,4
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					int cnt = 0;
					for(int m = 1; m <= sum; m++) {
						if(sum % m == 0) {
							cnt++;
						}
					}
					if(cnt == 2) {
						// 소수
						System.out.println("sum :" + sum);
					}
				}
			}
		}
		
		
	}
}
