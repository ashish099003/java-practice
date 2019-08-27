package PracticeJava;

import java.util.HashMap;
import java.util.Map;

public class imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
		String test ="a2b3c5b2c2d5";
		HashMap<Character, Integer>  hmp = new HashMap<Character,Integer>();
		for(int i = 0 ; i < test.length()-2; i++) {
			
			if(!hmp.containsKey(test.charAt(i))) {
				hmp.put(test.charAt(i), Character.getNumericValue(test.charAt(i+1)));
			
			}
			
			else {
				hmp.put(test.charAt(i), hmp.get(test.charAt(i))+Character.getNumericValue(test.charAt(i+1)));			
			}
			i++;			

	}
		String temp ="";
		for(Map.Entry<Character,Integer> entry : hmp.entrySet()) {
			
			temp+= entry.getKey() + entry.getValue().toString() ;
		}
		
		System.out.println(temp);

}
}
