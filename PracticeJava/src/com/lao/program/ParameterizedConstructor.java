package com.lao.program; //+example for parameterized constructor .We passed the parameter in runtime .

public class ParameterizedConstructor {
	
	static String studentname;
	int studentid;
	
	ParameterizedConstructor(String name,int id){
		studentname = name;
		studentid = id;
		
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor("Lavanya Rathinamoorthy", 7); 
		System.out.print(obj.studentname);
		System.out.println(obj.studentid);
		
		
	//	The below is for static keyword without calling the object .we called with classname.variable name 
		
	//System.out.println(ParameterizedConstructor.studentname);
}

}
