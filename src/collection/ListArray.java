package collection;

import java.io.IOException;
import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n =5 ;
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		for(int i =0; i < 5 ; i++) {
			arrli.add(i);
		}
		
		System.out.println(arrli);
	//	arrli.remove(0);
		for(int i =0; i < 5 ; i++) {
			System.out.println(arrli.get(i));
		}
		
		
	}

}
