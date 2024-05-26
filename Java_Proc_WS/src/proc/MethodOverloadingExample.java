package proc;

/**
 * @author hbhandari247-git
 */
public class MethodOverloadingExample {

	// Method with 2 integer parameters
	static int Multiply(int a, int b) {
		// Returns product of integer numbers
		System.out.println("Inside method - 1");
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b) {
		// Returns product of double numbers
		System.out.println("Inside method - 2");
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(int a, double b) {
		// Returns product of double numbers
		System.out.println("Inside method - 3");
		return a * b;
	}

	static void overloadedMethod(A a) {
		System.out.println("ONE");
	}

	static void overloadedMethod(B b) {
		System.out.println("TWO");
	}

	static void overloadedMethod(Object obj) {
		System.out.println("THREE");
	}

	static void overloadedMethod(C obj) {
		System.out.println("FOUR");
	}

	// Main driver method
	public static void main(String[] args) {
		// Calling method by passing
		// input as in arguments
		System.out.println(Multiply(2, 4));
		System.out.println(Multiply(5.5, 6.3));
		System.out.println(Multiply(6, 6.3));

		C c = new C();

		overloadedMethod(c);
	}

}

class A {

}

class B extends A {

}

class C extends B {

}
