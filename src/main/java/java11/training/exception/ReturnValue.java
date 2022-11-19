package java11.training.exception;

public class ReturnValue {
	public static void main(String args[]) {
		System.out.print("Returned Value is: " + method1());
	}

	public static int method1() {
		int value = 1;
		try {
			int a=10/0;
		} catch (ArithmeticException e) {
			value = 2;
			System.out.println("Exception caught value is " + value);
			return value; // value is being returned inside catch
		} finally {
			value = 3;
			System.out.println("Finally value is now " + value);
			return value; // value is being returned inside finally
		}
	}

}
