package PracticeJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
	/*      	
	String s1 = "ABCD";
	String s2 = "CDAB";
	if(s1.length()==s2.length()) {
		int count =0;
		int intial = s2.indexOf(s1.charAt(0));
		System.out.println(intial);
		while(count<s1.length()) {
			if(intial>s2.length()-1)
				intial = 0;
			if(s1.charAt(count)==s2.charAt(intial)) {
				count++;
				intial++;
			}
			else {
				System.out.println("False");
			     count++;
			}	
		}
		System.out.println("True");
	
		
	}*/
		//String rotation ;
	/*	String s1 = "ABCD";
		String s2 = "CDAB";
		if(s1.length()==s2.length() && (s1+s1).contains(s2))
		{
			System.out.println("Yes"); 
		} 
		else System.out.println("No");
		*/
/*		String str="Ajit";
		int count =0;
		int i =0;
		Map<Character,Integer> hmp = new HashMap<Character,Integer>();
		while(count<str.length()) {
			if(hmp.containsKey(str.charAt(i))==false) {
				hmp.put((str.charAt(i)), 1);
				count++;
				i++;
			}
			else {
				hmp.put((str.charAt(i)), hmp.get(str.charAt(i))+1);
				i++;
				count++;
			}
		}
		for(Map.Entry<Character, Integer> ent : hmp.entrySet()) {
			System.out.print(ent.getKey());
			System.out.println(" "+ent.getValue());
		}
		
	}	
*/
		String sPopularTopic_1 = "Selenium Automation Framework";
		String sPopularTopic_2 = "Basic Java Tutorial";
		
		// Compare two String: This would compare two strings
		 // If the twos strings are equal, it will return 'true' else it will return 'false'
		
		 
		 
		 boolean bCompareResult = sPopularTopic_1.equals(sPopularTopic_2);
		 System.out.println("The result of String Comparison is : " + bCompareResult);

		 char cIndex = sPopularTopic_1.charAt(5);
		 System.out.println("The fifth character of Popular Topic 1 is : " + cIndex);
	
		 
		 boolean bContainResult = sPopularTopic_1.contains("Framework");
		 System.out.println("The result of string Framework is contained in the String sPopularTopic_1 is : " + bContainResult);
	
		 int iIndex = sPopularTopic_1.indexOf("Framework");
		 System.out.println("The start index of the string Framework is : " + iIndex);
		
		
		 String sSubString = sPopularTopic_1.substring(iIndex);
		 System.out.println("The sub string from the index number is : " + sSubString);
	
		 
		 sSubString = sPopularTopic_1.substring(8, 19);
		 System.out.println("The sub string of Popular Topic 1 from index 8 to 18 is : " + sSubString);
	
		 
		 String sLowerCase = sPopularTopic_1.toLowerCase();
		 System.out.println("The lower case of the Popular Topic 1 is : " + sLowerCase);
		
		 String [] aSplit = sPopularTopic_1.split(" ");
		 System.out.println("The first part of the array is : " + aSplit[0]);
		 System.out.println("The last part of the array is : " + aSplit[1]);
		 System.out.println("The last part of the array is : " + aSplit[2]);
		 
		
	}		
}
