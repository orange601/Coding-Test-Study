package com.coding.upgrade.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Knumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		List<Integer> list = new ArrayList<>();
		
		// 1. i와 j만큼 자르기
		for(int[] command : commands) {
			for(int m = 0; m < command.length;) {
				int i = command[0];
				int j = command[1];
				int k = command[2];
				
				int[] answer = Arrays.copyOfRange(array, i-1, j);
				Arrays.sort(answer);
				list.add(answer[k-1]);
				break;
			}
		}
		
	}

}
