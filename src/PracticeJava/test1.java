package PracticeJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;

interface test{
	 
	 int x=10;
	 
	  default void check() {
		 
		 System.out.println("testing default method");
	 }
	 
 }
class test2 {
	
	public void sp() {
		System.out.println(10);
	}
	
	public void sp2() {
		System.out.println("inside base classs");
	}
	
	

}

public class test1 extends test2 implements test{
	
	@Override
	public void sp() {
		System.out.println(20);
		check();
		
		System.out.println(x);
	}
	

	
	
	
	public static void main(String [] args) {
		
		int number = 11;
		int NUMBER = 11;
		int Number = 11;
		System.out.print(number);
		System.out.print(Number);
		System.out.print(NUMBER);
	
			
	}
	
}
