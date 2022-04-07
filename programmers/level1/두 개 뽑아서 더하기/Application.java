package com.coding.upgrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		
		List<Integer> sums = new ArrayList<>();
		
		for(int i = 0; i < numbers.length -1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if(!sums.contains(sum)) {
					sums.add(sum);
				}
			}
		}
		
		Collections.sort(sums);
		
        int answer[] = new int[sums.size()];
        for(int i = 0; i < sums.size(); i++){
            answer[i] = sums.get(i);
        }
        
		for(int i = 0; i < answer.length; i++) {
			System.out.printf("%s", answer[i]);
		}
	}
}
