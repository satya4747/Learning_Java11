package java11.training.myenum;

public enum MyColorEnum {
	RED("red"),
	GREEN("green"),
	BLUE("blue");
	
	String str;
	MyColorEnum() {}
	MyColorEnum(String str) {
		this.str =  str;
	}
	
	
	
	public String getDetails() {
		return "welcome-"+str;
	}
}
