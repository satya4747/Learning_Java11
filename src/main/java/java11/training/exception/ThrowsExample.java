package java11.training.exception;

public class ThrowsExample {
	public static void main(String[] args) {
		System.out.println("START...");
		int age = 65;
		try {
		System.out.println(calculateSal(age));
		}catch(Exception e) {
			age=0;
			System.out.println(e);
		}
//		System.out.println(add(2, 3));
//		try {
//		System.out.println(div(2, 0));
//		
//		}catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		}
//		System.out.println(sub(2, 3));
		System.out.println("END...");
		
	}

	private static int calculateSal(int age) throws AgeException {
		if(age > 60) {
			AgeException e = new AgeException();
			throw e;
		}
		return age*1000;
	}

//	private static int div(int i, int j) {
//		
//		int t = i/j;
//		
//		return t;
//	}
//
//	private static int sub(int i, int j) {
//		int t = i-j;
//		return t;
//	}
//
//	private static int add(int i, int j) {
//		int t = i+j;
//		return t;
//	}
	

}
