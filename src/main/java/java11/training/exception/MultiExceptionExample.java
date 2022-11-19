package java11.training.exception;

public class MultiExceptionExample {

	public static void main(String[] args) {
		String s ="welcome";
		System.out.println("Start");
		try {
		//int b = 2+ args[0].length()/0;
		int a = 2+s.length()/0;		
		}catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("ArithmeticException occur:"+ e);	
			}
			if(e instanceof NullPointerException) {
				System.out.println("NullPointerException occur:"+ e);	
			}
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("ArrayIndexOutOfBoundsException occur:"+ e);	
			}
		}
		finally {
			System.out.println("Ending..");
		}
		System.out.println("end");
	}
}

