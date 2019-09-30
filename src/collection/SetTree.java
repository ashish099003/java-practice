package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setele = new HashSet<String>(5);
		setele.add("geeks");
		setele.add("for");
		setele.add("geeks");
		setele.add("ashish");
		setele.add("genius");
		System.out.println(setele);
		TreeSet<String> treeset = new TreeSet<String>(setele);
		System.out.println(treeset);
		
		Set<Integer>hash_Set = new HashSet<Integer>();
		hash_Set.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,6,7,8,9}));
		Set<Integer>hash_Set1 = new HashSet<Integer>();
		hash_Set1.addAll(Arrays.asList(new Integer[] {4,5,6,7,9}));
		
		// Union 
		Set<Integer> union = new HashSet<Integer>(hash_Set);
		union.addAll(hash_Set1);
		System.out.println("Union : "+union);
		
		// Intersection
		
		Set<Integer> intersection = new HashSet<Integer>(hash_Set);
		intersection.retainAll(hash_Set1);
		System.out.println("Intersection : "+intersection);
		
		//Symmeteric difference
		Set<Integer> difference = new HashSet<Integer>(hash_Set);
		difference.removeAll(hash_Set1);
		System.out.println("difference : "+difference);
		
	}

}
