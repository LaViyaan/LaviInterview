package com.java.basic.programs;

public class FirstJavaProgram {
	
	
	public static void main(String[] args) {

		String[] studentName = {"Lavanya", "Arun", "Chandra", "Mahalingam"};	
		
		int[] marks = {10, 24, 25, 40};
		
		
		for(int i=0; i<studentName.length; i++) {
			System.out.print(studentName[i]);
			for(int j=0; j<marks.length; j++) {
				System.out.print("  "+Integer.toString(marks[j]) + ", ");
			}
			System.out.println("\n");
		}

		
//		System.out.println(Integer.toString(getLoanAmountOfCustomer()));
		
	}
	
	public static int getLoanAmountOfCustomer() {
		int loanAmount = 10000;
		
		return loanAmount;
	}

}




//Write a program to print order details which has Customer Name, Order ID, Ordered Item and Order Value where
//all these values are fetched from different classes