package PracticeJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MultiThreadDemo  extends Thread{
	public void run() {
		 try
	        {
			 for (int i = 0; i < 5; i++)
		        {
		            System.out.println("Child thread");
		        }
	        }
	        catch (Exception e)
	        {
	            // Throwing an exception
	        	e.printStackTrace();
	            System.out.println ("Exception is caught");
	        }
	}
	
	
}

	

/*class MultithreadingDemo implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                                Thread.currentThread().getId() +
                                " is running");
            System.out.println ("Thread  is in" +
                    Thread.currentThread().getState() +
                    " state ");
 
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}
*/