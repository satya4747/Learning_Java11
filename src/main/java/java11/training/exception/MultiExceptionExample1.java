package java11.training.exception;

public class MultiExceptionExample1 {

	public static void main(String[] args) {
		String s ="welcome";
		System.out.println("Start");
		try {
		//int b = 2+ args[0].length()/0;
		int a = 2+s.length()/0;		
		}catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Ending..");
		}
		System.out.println("end");
	}
}

