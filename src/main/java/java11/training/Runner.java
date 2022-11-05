package java11.training;

public class Runner {
	public static void main(String[] arr){
		System.out.println("Main method---");
		for (String string : arr) {
			System.out.println(string);	
		}
		Employee obj = new Employee();
		obj.age=10;
		obj.salary=30000;
		obj.name="Guest";
		System.out.println(obj);
		System.out.println(obj.toString());
	 
    }
}
