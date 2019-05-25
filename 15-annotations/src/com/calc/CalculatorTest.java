package com.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	/*
	 * 
	 * uni testing ===> AAA
	 * 
	 * A ==> Arrange A ==> Act A ==> Assert
	 * 
	 */

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator(); // Arrange
	}

	@Test
	public void onePlusTwo() {
		int expected = 3;
		int actual = calculator.add(1, 2); // Act
		Assert.assertEquals(expected, actual); // Assert

	}

	@Test
	public void onePlusThree() {
		int expected = 4;
		int actual = calculator.add(1, 3); // Act
		Assert.assertEquals(expected, actual); // Assert

	}

}
