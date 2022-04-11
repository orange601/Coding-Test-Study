package com.coding.upgrade.level1;

import java.util.HashMap;
import java.util.Map;

public class Lotto {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(6, 1);
		map.put(5, 2);
		map.put(4, 3);
		map.put(3, 4);
		map.put(2, 5);
		map.put(1, 6);
		map.put(0, 6);
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		// result = [3, 5];
		
		int maxcnt = 0;
		int minicnt = 0;
		for(int i = 0; i < lottos.length; i++) {
			int num = lottos[i];
			// 0 개수
			if(num <= 0) {
				maxcnt++;
			}
			for(int j = 0; j < win_nums.length; j++) {
				int win = win_nums[j];
				if(num == win) {
					maxcnt++;
					minicnt++;
				}
			}
		}
		
		int[] answers = {map.get(maxcnt), map.get(minicnt)};
		
		for(int i : answers) {
			System.out.println(i);
		}
		
	}

}
