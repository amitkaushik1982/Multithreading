package com.string;

public class StringTest {

	public static void main(String[] args) {
		int firstNumber = 10;
		String secondNumber = "10";
		if(firstNumber == Integer.parseInt(secondNumber)){
			System.out.println("1. Numbers are equals");
		}else{
			System.out.println("1. Numbers are not equals");
		}
		
		
		if(secondNumber.equals(String.valueOf(firstNumber))){
			System.out.println("2. Numbers are equals");
		}else{
			System.out.println("2. Numbers are not equals");
		}
		

	}

}
