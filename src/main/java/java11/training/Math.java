package java11.training;

abstract public class Math {
	int a;
	int b;
	
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void mul() {
		System.out.println(a*b);
	}
	abstract void setProperties(int a, int b);
}

class Math2 extends Math{
	@Override
	void setProperties(int a, int b) {
	this.a=a;
	this.b=b;
	}
}
