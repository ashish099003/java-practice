package PracticeJava;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> arl = new ArrayList<Character>();
		arl.add('A');
		arl.add('B');
		arl.add('C');
		arl.add('D');
		arl.add('E');
		arl.add('F');
		
		ListIterator<Character> litr = arl.listIterator();
		
		while(litr.hasNext()) {
			
			System.out.print(litr.next());
		}
		litr.add('G');
		System.out.print("\n");
		
		while(litr.hasPrevious()) {
			System.out.print(litr.previous());
		}
		
	}

}
