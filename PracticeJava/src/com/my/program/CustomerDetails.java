package com.my.program;

public class CustomerDetails {

	public static void main(String[] args) {

        //Created an object and using that object we called a function of another class (CustomerName)
		CustomerName obj = new CustomerName();
        System.out.println(obj.customerName());

        //Below is the example of Static keyword. If we use static keyword we dont need to create an object.
        //instead in syso we have to use classname.function name .We used static keyword in OrderID,OrderItem,OrderValue classes  
		//System.out.println(CustomerName.customerName());
		System.out.println(OrderID.orderID());
		System.out.println(OrderItem.orderItem());
		System.out.println(OrderValue.orderValue());

	}

}


