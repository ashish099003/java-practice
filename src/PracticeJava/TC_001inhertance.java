package PracticeJava;

public  abstract class TC_001inhertance {
	
	private String name;
	 public void TC_001inhertance(String name) {
		 this.name =name;
		System.out.println("i am in parent class");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
