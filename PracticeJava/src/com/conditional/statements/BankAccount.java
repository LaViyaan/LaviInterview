package com.conditional.statements;

public class BankAccount {
	
	 int age = 100;
	 
	     
	 

	public static void main(String[] args) {
		
		
	//	BankAccount obj = new BankAccount();
	//	obj.ageGroups();
	//}
		
		BankAccount obj = new BankAccount();
		
		if(obj.age>=80 && obj.age<105)
		{
			
			System.out.println("The pension amount is 5000 per month");
		}
		else if(obj.age<=50)
		{
			System.out.println("No pension for this age group");
		}
		else if(obj.age>50 && obj.age<80)
		{
			System.out.println("The pension amount is 3000 per month");
		}
			else 
			{
				System.out.println("The bank will support for living further");
			}
}}
           
	/*	public void ageGroups() {
			switch(age) {
			case 81:
				System.out.println("The pension amount is 5000");
			break;
			case 50:
				System.out.println("The pension amount is 2000");
				break;
				default :
					System.out.println("Invalid");
				
		}
			
		}}*/
		