package com.coding.upgrade.level1;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveEqualNumbers {
	
	@Test
	public void equalNums() {
		int[] arr = {1,1,3,3,0,1,1};
		
		List<Integer> list = new ArrayList<>();

		int tempNum = -1;
		for(int i = 0; i < arr.length; i++) {
			int no = arr[i];
			if(tempNum != no) {
				tempNum = no;
				list.add(no);
			}
		}
		
		int[] result = {1,3,0,1};
		
		int[] answers = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answers[i] = list.get(i);
		}
		
		Assertions.assertArrayEquals(result, answers);
	}

}
