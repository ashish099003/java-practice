package PracticeJava;

import java.util.Arrays;

public class ParallelSort {
	
	public static final int  BaseArraySize=1000;
	
	public static double [] generateArray(int size) {
		if(size<=0 || size>Integer.MAX_VALUE)
			return null;
		double [] result = new double[size] ;
		for(int i=0;i<size;i++) {
			result[i]=Math.random();
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<10000;i*=10) {
			int size = BaseArraySize*i;
			double [] arr1= generateArray(size);
			double [] arr2 = Arrays.copyOf(arr1, size);
			long startTime = System.currentTimeMillis();
			Arrays.sort(arr1);
			long endTime = System.currentTimeMillis();
			System.out.println("Time Interval at serial sort: "+(endTime-startTime)+" ms");
			long startTime1 = System.currentTimeMillis();
			Arrays.parallelSort(arr2);
			long endTime1 = System.currentTimeMillis();
			System.out.println("Time Interval at paralle sort: "+(endTime1-startTime1)+" ms");
			System.out.println(); 
			
		}
	}

}
