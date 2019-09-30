package collection;

import java.util.LinkedList;

public class ListLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linlist = new LinkedList<Integer>();
		for(int i =0 ; i<10;i++) {
			linlist.add(i);
		}

		System.out.println("list of element in linkedlist  before removing 1st and last element: " +linlist);
		linlist.removeFirst();
		linlist.removeLast();
		System.out.println("list of element in linkedlist  after removing 1st and last element: " +linlist);
		
	}

}
