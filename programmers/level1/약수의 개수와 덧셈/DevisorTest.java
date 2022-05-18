package com.coding.upgrade.level1;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DevisorTest {
	@Test
	public void devisor() {
		int left = 13;
		int right = 17;
		
		// 약수 구하기
		List<Integer> nums = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		for(int i = left; i <= right; i++) {
			nums.add(i);
			int k = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					k++;
				}
			}
			list.add(k);
		}
		
		int m = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				m += nums.get(i);
			} else {
				m -= nums.get(i);
			}
		}
		
		Assertions.assertEquals(43, m);
		
	}

}
