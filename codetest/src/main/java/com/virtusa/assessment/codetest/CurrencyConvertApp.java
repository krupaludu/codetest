package com.virtusa.assessment.codetest;

public class CurrencyConvertApp {
	public static void main(String[] args) {
		int number = 0;
		try {
			number = 56945781;//0;
			if (number == 0) {
				System.out.print("Given Number ("+number+") in words: Zero");
			} else {
				System.out.print("Given Number ("+number+") in words: " + CurrencyToWordUtil.convert(number));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Please enter a valid number");
		}
	}
}
