package PracticeJava;

// this program is an example for swapping object of a class. 

public class Car {
	int no;
	int model;
	Car(int model, int no){
		this.model = model;
		this.no = no;
	}
	
	void print()
    {
        System.out.println("no = " + no + 
                           ", model = " + model);

    }

}
// wrapper class usses instance of class whose objects need to be swapped

class CarWrapper{
	
	Car c;
	
	CarWrapper(Car c){
		this.c = c;
	}
}
class Main{
	
	public static void swap(CarWrapper cw1,CarWrapper cw2 ) {
		Car temp = cw1.c;
		cw1.c = cw2.c;
		cw2.c=temp;
	}
	
	public static void main(String [] args ) {
		Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);
        swap(cw1, cw2);
        cw1.c.print();
        cw2.c.print();
	}
}
