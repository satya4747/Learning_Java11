package java11.training;

public class Runner {
	
	static
	{
		System.out.println("static init");
	}
	
	public static void main1(String[] args) {
		System.out.println(Database.count);
		Database.check();
		Database d  = new Database();
		d.check();
		System.out.println("End");
	}

}

