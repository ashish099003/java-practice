package PracticeJava;

import java.util.HashMap;

public class ArrayElements {
	
	class pair{
		int first;
		int second;
		
		pair(int f, int s){
			first = f;
			second = s;
		}
	}
		Boolean findPairs(int arr[]) {
			HashMap<Integer, pair> hmp = new HashMap<Integer,pair>();
			int n = arr.length;
			for(int i = 0 ; i <n; ++i) {
				for(int j =i +1 ; j<n ;++j) {
					int sum = arr[i] + arr[j];
					if(!hmp.containsKey(sum))
							hmp.put(sum, new pair(arr[i],arr[j]));
					
					else {
						pair p = hmp.get(sum);
						System.out.println("("+arr[p.first]+", "+arr[p.second]+ 
                                ") and ("+arr[i]+", "+arr[j]+")"); 
						return true; 

					}
				}
			}
			
			return false;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 7, 1, 2, 9, 8}; 
        ArrayElements a = new ArrayElements(); 
        a.findPairs(arr); 


	}

}
