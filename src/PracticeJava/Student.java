package PracticeJava;

public class Student {
	
	public static int lastNum = 100;
	int rollNumber;
	
	Student(){
		rollNumber= lastNum;
		lastNum++;
	}
	@Override
	public int hashCode() {
		return rollNumber;
	}
	
	public static void main(String [] args) {
		
		Student st = new Student();
		System.out.println(st);
		System.out.println(st.toString());
		Student st1 = new Student();
		System.out.println(st1);
		System.out.println(st1.toString());
	}
}
