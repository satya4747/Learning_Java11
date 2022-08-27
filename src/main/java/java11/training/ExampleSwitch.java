package java11.training;

//https://github.com/smeashwani/Learning_Java11.git
public class ExampleSwitch {
	public static void main(String[] args) {
		System.out.println("START");
		int marks = 20;
		switch (marks) {
		default:
			System.out.println("Fail");
			break;
		case 10:
		case 20:
		case 30:
			System.out.println("X"); break;
		case 40:
		case 50:
		case 60:
			System.out.println("Y"); break;
		case 70:
			System.out.println("C");
			break;
		case 80:
			System.out.println("B");
			break;
		case 90:
			System.out.println("A");
			break;
		case 100:
			System.out.println("A+");
		}

		System.out.println("END");
	}
}
