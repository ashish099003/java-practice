package PracticeJava;

public class DriverClass  extends Thread{

	public static void main(String[] args) {
		
		 
			 Thread t1 = new Thread();
			 System.out.println("Name of Thread :"+t1.getName());
			 t1.setName("DriverThread");
			 System.out.println("Name of Thread  after setting new name :"+t1.getName());
			 System.out.println("Priority of main thread :"+t1.getPriority());
			 t1.setPriority(MAX_PRIORITY);
	         System.out.println("Main thread new priority: "+ t1.getPriority());
	         for (int i = 0; i < 5; i++)
	         {
	             System.out.println("Main thread ");
	         }   
			 MultiThreadDemo mtd = new MultiThreadDemo();
			 System.out.println("Child thread priority: "+ mtd.getPriority());
	         
		        // setting priority of Main thread to MIN(1)
			 	mtd.setPriority(MIN_PRIORITY);
		         
		        System.out.println("Child thread new priority: "+ mtd.getPriority());
		         
		        // starting child thread
		        mtd.start();
		      
			 
		 
		 
	}
}

