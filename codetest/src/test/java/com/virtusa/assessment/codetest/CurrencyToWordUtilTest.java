package com.virtusa.assessment.codetest;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CurrencyToWordUtilTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConvert_ForZeroCurrency() {
		int curr = 0;
		String inWords = "";
		try {
			inWords = CurrencyToWordUtil.convert(curr);
		} catch (Exception e) {
			fail("Tes case Failed : testConvert_ForZeroCurrency");
		}
		Assert.assertEquals("zero", inWords);
	}

	public void testConvert_ForInvalidInputNegativeNumber() {
		int curr = -10;
		try {
		String inWords = CurrencyToWordUtil.convert(curr);
		}catch(Exception e) {
			//String errMsg = e.getMessage().trim();
			if("Invalid Currency, should not be negative value".equals(e.getMessage().trim())) {
				Assert.assertTrue(true);
			}else {
				fail("Tes case Failed : testConvert_ForInvalidInputNegativeNumber"); 
			}
		}
	}

	public void testConvert_ForValidCurrencyMillion() {
		int curr = 56945781;
		String inWords = "";
		try {
			inWords = CurrencyToWordUtil.convert(curr);
		} catch (Exception e) {
			fail("Tes case Failed : testConvert_ForValidCurrency");
		}
		Assert.assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", inWords);
	}

	public void testConvert_ForValidCurrencyHundreds() {
		int curr = 781;
		String inWords = "";
		try {
			inWords = CurrencyToWordUtil.convert(curr);
		} catch (Exception e) {
			fail("Tes case Failed : testConvert_ForValidCurrencyHundreds");
		}
		Assert.assertEquals("seven hundred and eighty one", inWords);
	}
	
	public void testConvert_ForValidCurrencyThousands() {
		int curr = 5781;
		String inWords = "";
		try {
			inWords = CurrencyToWordUtil.convert(curr);
		} catch (Exception e) {
			fail("Tes case Failed : testConvert_ForValidCurrencyThousands");
		}
		Assert.assertEquals("five thousand seven hundred and eighty one", inWords);
	}
	public void testConvert_ForValidCurrencyTens() {
		int curr = 81;
		String inWords = "";
		try {
			inWords = CurrencyToWordUtil.convert(curr);
		} catch (Exception e) {
			fail("Tes case Failed : testConvert_ForValidCurrencyTens");
		}
		Assert.assertEquals("eighty one", inWords);
	}
	public void testConvert_ForValidCurrencyOnes() {
		int curr = 1;
		String inWords = "";
		try {
			inWords = CurrencyToWordUtil.convert(curr);
		} catch (Exception e) {
			fail("Tes case Failed : testConvert_ForValidCurrencyOnes");
		}
		Assert.assertEquals("one", inWords);
	}
}
