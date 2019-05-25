package com.virtusa.assessment.codetest;

public class CurrencyToWordUtil {

	public static String convert(int currency) throws Exception{
		String c2word = "";
		c2word = num2word(currency);
		return c2word;
	}

	private static String num2word(int num) throws Exception{
		String inWords = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (num == 0) {
			return "zero";
		}else if(num <0){
			throw new Exception("Invalid Currency, should not be negative value");
		}

		if ((num / 1000000) > 0) {
			inWords += num2word(num / 1000000) + " million ";
			num %= 1000000;
		}
		if ((num / 1000) > 0) {
			inWords += num2word(num / 1000) + " thousand ";
			num %= 1000;
		}
		if ((num / 100) > 0) {
			inWords += num2word(num / 100) + " hundred and ";
			num %= 100;
		}

		if (num > 0) {
			if (num < 20) {
				inWords += unitsArray[num];
			} else {
				inWords += tensArray[num / 10];
				if ((num % 10) > 0) {
					inWords += " " + unitsArray[num % 10];
				}
			}
		}
		return inWords;
	}

}
