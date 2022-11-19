package java11.training.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		String s ="welcome";
		System.out.println("Start");
		try {
		//int b = 2+ args[0].length()/0;
		int a = 2+s.length()/0;		
		}catch(NullPointerException e) {
			System.out.println("NullPointerException occur:"+ e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occur:"+ e);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException occur:"+ e);
		}
		finally {
			System.out.println("Ending..");
		}
		System.out.println("end");
	}
}

