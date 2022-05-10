package com.coding.upgrade.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumValidationTest {
	
	@Test
	public void NumValidation() {
		String s = "1234";
		boolean answer = false;
        if(s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				answer = true;
			} catch (Exception e) {}
		}
		Assertions.assertEquals(true, answer);
	}
	
}
