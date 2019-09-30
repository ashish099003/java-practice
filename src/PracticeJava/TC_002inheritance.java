package PracticeJava;

public class TC_002inheritance extends TC_001inhertance implements inter1,inter2{
	
	public void display1() {
		System.out.println("interface1");
	}
	
	public void display() {
		System.out.println("interface1");
	}
	public void check() {
	//	super("Sinha");
		System.out.println("i am in child class");
	}
	
	public static void main(String args[]) {
		
		TC_001inhertance t1 = new TC_002inheritance();
		t1.setName("Shish");
		
		
		
	//	t1.setName("Ashish");
		System.out.println(t1.getName());
		
	}

}
