package com.coding.upgrade.level1;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		List<Integer> list = new ArrayList<>();
		for(int number : numbers) {
			list.add(number);
		}
		
		int answer = 0;
		// 기준
		for(int i = 1; i < 10; i++) {
			// 원소
			if(!list.contains(i)) {
				answer += i;
			}
		}
		
		System.out.println(answer);
	}

}
