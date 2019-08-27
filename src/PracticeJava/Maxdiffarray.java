package PracticeJava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

	/*
	 * Sort the integers in ascending order by the number of 1's in their binary
	 * representations. For example, 7→ 111 and 8 → 1000, so 8 (which has single 1
	 * in binary) would be ordered before 7 (which has triple 1's in binary). Two or
	 * more integers having the same number of 1's in their binary representations
	 * are ordered by increasing decimal value. For example, 5 → 101 and 6→ 110 both
	 * contain double 1's in their binary representation, so 5 would be ordered
	 * before 6 because it has the smaller decimal value.
	 */

	public class Maxdiffarray {


	public ArrayList<Integer> rearrangeList(ArrayList<Integer> theList) {

	    Collections.sort(theList, new Comparator<Integer>() {

	        @Override
	        public int compare(Integer num1, Integer num2) {
	            /*
	             * a negative integer, zero, or a positive integer as the first argument 
	             * is less
	             * than, equal to, or greater than the second.
	             */
	            int result = 0;
	            if (num1 == num2) {
	                result = 0;
	            } else if (Integer.bitCount(num1) < Integer.bitCount(num2)) {// 5=101 and 
	                                                                         // 7=111
	                result = -1;
	            } else if (Integer.bitCount(num1) > Integer.bitCount(num2)) {// 7=111 and 
	                                                                         // 6=110
	                result = 1;
	            } else if (Integer.bitCount(num1) == Integer.bitCount(num2)) {// 5=101 
	                                                                          // 10=1010
	                result = (num1 < num2) ? -1 : 1;// sort in natural order
	            }
	            return result;
	        }
	    });

	    return theList;
	    }



public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> test = new ArrayList<Integer>();
			test.add(3);
			test.add(3);
			test.add(3);
			test.add(4);
			test.add(5);
			
			
			 ArrayList<Integer> myList = new ArrayList<>();
			    myList.add(5);
			    myList.add(3);
			    myList.add(5);
			    myList.add(7);
			    myList.add(10);
			    myList.add(14);
			    myList.add(6);      

			    Solution s1 = new Solution();
			    System.out.println("before: " + myList.toString());
			    /*
			     * for (Integer num : myList) { System.out.println("*** sNumber = " + num);
			     * System.out.println("Binary = " + Integer.toBinaryString(num));
			     * System.out.println("Number of one bits = " + Integer.bitCount(num)); }
			     */
			    System.out.println("after: " + s1.rearrangeList(myList).toString());
			
			
	}

}
