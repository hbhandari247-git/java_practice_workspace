package proc;

//Java Program to Illustrate Invocation
//of Constructor Calling With Usage 
//of super Keyword

//Class 1
//Super class
class Base {
	int x;

	// Constructor of super class
	Base(int _x) {
		x = _x;
	}
}

//Class 2
//Sub class
class Derived extends Base {

	int y;

	// Constructor of sub class
	Derived(int _x, int _y) {

		// super keyword refers to super class
		super(_x);
		y = _y;
	}

	// Method of sub class
	void Display() {
		// Print statement
		System.out.println("x = " + x + ", y = " + y);
	}
}

//Class 3
//Main class
public class InheritanceDemo {

	// Main driver method
	public static void main(String[] args) {

		// Creating object of sub class
		// inside main() method
		Derived d = new Derived(10, 20);

		// Invoking method inside main() method
		d.Display();
	}
}
