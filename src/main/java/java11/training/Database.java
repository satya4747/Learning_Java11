package java11.training;

public class Database {
	
	static int count;
	
	static 
	{
		System.out.println("static init-1");
		count=15;
	}
	
	{
		System.out.println("3");
	}
	int age;	
	{
		age = 18;
		System.out.println("1");
	}

	{
		System.out.println("2");
	}

	static 
	{
		System.out.println("static init-2");
		count=12;
	}
	
	static void check() {
		count++;
		System.out.println("Database.check()");
	}

	
}
