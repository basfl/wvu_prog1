package com.generic.arithmetic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GenericArithmaticTest {
	private Arithmetic arithmetic;
	private String dn1;
	private String dn2;
	private String bn1;
	private String bn2;
	private String on1;
	private String on2;
	private String hn1;
	private String hn2;
	private int addExpectedResult;

	@Before
	public void setup() {
		arithmetic = new Arithmetic();
		int num1=Integer.parseInt(dn1.trim());
		int num2=Integer.parseInt(dn2.trim());
		addExpectedResult=num1+num2;
		System.out.println("=>expected is "+addExpectedResult);
	}

	@Test

	public void addTest() {
		Assert.assertEquals("", "1100", arithmetic.addition(bn1, bn2));
		Assert.assertEquals("", "c", arithmetic.addition(hn1, hn2));
		Assert.assertEquals("", "14", arithmetic.addition(on1, on2));
		Assert.assertEquals("", "12", arithmetic.addition(dn1, dn2));

	}

	@Test
	public void subtractionTest() {
		Assert.assertEquals("", "100", arithmetic.subtraction(bn1, bn2));
		Assert.assertEquals("", "4", arithmetic.subtraction(hn1, hn2));
		Assert.assertEquals("", "4", arithmetic.subtraction(on1, on2));
		Assert.assertEquals("", "4", arithmetic.subtraction(dn1, dn2));
	}

	@Test

	public void multiplicationTest() {

		Assert.assertEquals("", "100000", arithmetic.multiplication(bn1, bn2));
		Assert.assertEquals("", "20", arithmetic.multiplication(hn1, hn2));
		Assert.assertEquals("", "40", arithmetic.multiplication(on1, on2));
		Assert.assertEquals("", "32", arithmetic.multiplication(dn1, dn2));
	}

	@Test

	public void devisionTest() {
		

		Assert.assertEquals("", "10", arithmetic.division(bn1, bn2));
		Assert.assertEquals("", "2", arithmetic.division(hn1, hn2));
		Assert.assertEquals("", "2", arithmetic.division(on1, on2));
		Assert.assertEquals("", "2", arithmetic.division(dn1, dn2));

	}

	@Test

	public void powerTest() {

		Assert.assertEquals("", "1000000000000", arithmetic.power(bn1, bn2));
		Assert.assertEquals("", "1000", arithmetic.power(hn1, hn2));
		Assert.assertEquals("", "10000", arithmetic.power(on1, on2));
		Assert.assertEquals("", "4096", arithmetic.power(dn1, dn2));
		
		

	}

	@Test
		public void sqrtTest() {
		Assert.assertEquals("", "10", arithmetic.sqrt(bn1));
		Assert.assertEquals("", "2", arithmetic.sqrt(hn1));
		Assert.assertEquals("", "2", arithmetic.sqrt(on1));
		Assert.assertEquals("", "2", arithmetic.sqrt(dn1));
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "8", "4", "0b1000", "0b100", "010", "04", "0X8", "0X4" },

		});
	}

	public GenericArithmaticTest(String dn1, String dn2, String bn1, String bn2, String on1, String on2, String hn1,
			String hn2) {
		this.dn1 = dn1;
		this.dn2 = dn2;
		this.on1 = on1;
		this.on2 = on2;
		this.hn1 = hn1;
		this.hn2 = hn2;
		this.bn1 = bn1;
		this.bn2 = bn2;

	}

}
