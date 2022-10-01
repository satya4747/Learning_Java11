package java11.training;

public class Math {
	final int a;
	int b;
	static
	{
		System.out.println("MAth static init");
	}
	
	Math(){
		a=10;
		System.out.println("Math cons");
		a=20;
	}
//	void inc(int a, int b) {
//		this.a = a+1;
//		this.b = b+1;
//	}

}

class Math2 extends Math{
//	Math2(){
//		//super(10);
//		System.out.println("Math2 cons");
//	}
}
