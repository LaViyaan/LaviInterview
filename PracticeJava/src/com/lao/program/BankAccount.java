package com.lao.program; //Example of basic program with return type int used in the function 

public class BankAccount {
	
     long accountnumber = 1234567;
	String accountholdername = "Lavs";
	static int accountbalance = 700;
	
	
	public int accountdetails() 
	{

		System.out.println("My account balance is "+  accountbalance);
		return accountbalance;
			}
	

	public static void main(String[] args) {
		
	BankAccount account = new BankAccount();
	account.accountdetails();
	
		
		
		
		

	}

	
}
