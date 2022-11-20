package java11.training.myenum;

public class Runner {
	public static void main(String[] args) {
		MyColor color = MyColor.RED;
		System.out.println(color.getDetails());
		color = MyColor.GREEN;
		System.out.println(color.getDetails());
		color = MyColor.BLUE;
		System.out.println(color.getDetails());
		
		System.out.println("===========");
		MyColorEnum colorEnum = MyColorEnum.RED;

		System.out.println(colorEnum.getDetails());
		colorEnum = MyColorEnum.GREEN;
		System.out.println(colorEnum.ordinal());
		
		System.out.println(colorEnum.getDetails());
		colorEnum = MyColorEnum.BLUE;
		System.out.println(colorEnum.getDetails());
		
		System.out.println(colorEnum.valueOf("BLUE"));
		MyColorEnum[] values = MyColorEnum.values();
		for (MyColorEnum myColorEnum : values) {
			System.out.println(myColorEnum.getDetails());
		}
	}
}
