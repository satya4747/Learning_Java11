package java11.training;

import java11.training.exception.Printer;

public class Runner {
	public static void main(String[] arr){
//		System.out.println("Main method---");
//		for (String string : arr) {
//			System.out.println(string);	
//		}
//		Employee obj = new Employee();
//		obj.age=10;
//		obj.salary=30000;
//		obj.name="Guest";
//		System.out.println(obj);
//		System.out.println(obj.toString());
		
		System.out.println("Start");
		
		Printer p1 = new Printer();
		Printer p2 = new Printer();
		Printer p3 = new Printer();
		p2= p1;
		System.gc();
		
		
//		try(Printer p = new Printer()){
//			p.open();
//			p.scanningAndPrinting();
//			System.out.println("printing completed");
//		}finally {
//			System.out.println("....");
//		}
		
		
		System.out.println("end");
	 
    }
}
