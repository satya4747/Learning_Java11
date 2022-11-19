package java11.training;

import java11.training.exception.AgeException;

public class Simple {
	public static void main(String[] args) {
		int count=0;
		count=100;
		System.out.println(count);
		update(count);
		System.out.println(count);
	}

	private static void update(int c) {
		c=200;
		System.out.println(c);
		
	}
}
class parent{
	public int add() throws Exception 
	{return 0;}
}
class child extends parent{
	public int add() throws AgeException{
		return 0;
	}
}