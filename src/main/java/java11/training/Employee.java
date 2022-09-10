package java11.training;

public class Employee {
	
	int age;
	int salary;
	String name;
	static String companyName;
	
	{
		age =18;
		System.out.println("init block");
	}
	
	static 
	{
		companyName ="DUCAT";
		System.out.println("static init block");
	}
	
	
	

}
