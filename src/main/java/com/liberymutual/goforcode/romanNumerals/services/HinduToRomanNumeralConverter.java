package com.liberymutual.goforcode.romanNumerals.services;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.HashMap;

public class HinduToRomanNumeralConverter {
	
	private int number;
	
	public HinduToRomanNumeralConverter() {
		
	}
	
	public String convert(int num) {		
		
		number = num;
		int numOfTens;
		int remainder;
		
		HashMap<Integer, String> strNumbers = new HashMap<Integer, String>(19);
		strNumbers.put(1, "I");
		strNumbers.put(2, "II");
		strNumbers.put(3, "III");
		strNumbers.put(4, "IV");
		strNumbers.put(5, "V");
		strNumbers.put(6, "VI");
		strNumbers.put(7, "VII");
		strNumbers.put(8, "VIII");
		strNumbers.put(9, "IX");
		strNumbers.put(10, "X");
		strNumbers.put(20, "XX");
		strNumbers.put(30, "XXX");
		strNumbers.put(40, "XL");
		strNumbers.put(50, "L");
		strNumbers.put(60, "LX");
		strNumbers.put(70, "LXX");
		strNumbers.put(80, "LXXX");
		strNumbers.put(90, "XC");
		strNumbers.put(100, "C");
		
		
		if(strNumbers.containsKey(number)) {
			return strNumbers.get(number).toString();	
		}
		
		else {
			
			numOfTens = number / 10;
			remainder = number % 10;
			
			int i = (int) Math.floor(numOfTens) * 10;
			return strNumbers.get(i) + strNumbers.get(remainder);	
		}		
			
	}
	
	
	
	

}
