package com.collection.arraylist;

import java.util.ArrayList;   // We have to import the ArrayList classes

public class Attendance {
	
	public static void main(String[] args) { 
		
  ArrayList<String> obj = new ArrayList<String>();
		obj.add("Lavanya");
		obj.add("Rathu");
		obj.add("Viyaan");
		obj.add("Arun");
		obj.add("Chandra");
		obj.add("Chandra");
		obj.add("Mahal");
		obj.add("null");
		obj.add(4, "Kaviya");
		
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		obj1.add(40);
		
		ArrayList obj2 = new ArrayList();
		
		
//		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.indexOf("Chandra"));
		System.out.println(obj.lastIndexOf("Mahal"));
		System.out.println(obj.lastIndexOf("Chandra"));
		System.out.println(obj.remove(7));
		System.out.println(obj.set(0,"Lavi"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove("Chandra"));
//		System.out.println(obj);
//		System.out.println(obj.size());
//		System.out.println(obj);
		System.out.println(obj.contains("Viyaan"));
//		System.out.println(obj.addAll(obj1)); //will add two array list
//		System.out.println(obj);
//	    System.out.println(obj2.addAll(obj)); //will make a copy of the array with same elemnts
//    	System.out.println(obj2);
    // iterating using a normal for loop
    //	for(int i=0;i<=obj.size();i++)
    //	{
    //		System.out.println(obj.get(i));
    //	}
    	
    	for(Integer ab:obj1) {
    		System.out.println(Integer.toString(ab));
    		
    	}
		
		 
		
}
}