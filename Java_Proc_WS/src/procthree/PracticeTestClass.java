package procthree;

import java.util.Arrays;

public class PracticeTestClass {

	static {
		System.out.println("Static block executed");
	}

	static int display() {
		return 5;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		System.out.println("Main method executed");

		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.println("x: " + x);// 6
		System.out.println("y: " + y);// 9
		System.out.println("z: " + z);// 60

		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

		int a = 5;
		for (int i = 0; i < 3; i++) {
			a += i;
		}
		System.out.println(a);// 8

		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		Parent obj = new Child();
		obj.display();// Child display

		try {
			int b = 5 / 0; // catch and final both will execute sysouts
			System.out.println(b);
		} catch (ArithmeticException e) {
			// int c=5/0; finally block will still execute but exception will also be thrown
			System.out.println("ArithmeticException caught");
		} finally {
			System.out.println("Finally block executed");
		}

		StaticTest staticTest = null;
		staticTest.display();// Static method is class level not instance level //Static display()

		OverloadTest overloadTest = new OverloadTest();
		overloadTest.display(5);// Display int: 5
		overloadTest.display("Hello");// Display String: Hello

		final int c = 10;
		// c = 20; // Uncommenting this line will cause a compilation error
		System.out.println(c);

		C obj1 = new C();
		D obj2 = new D();
		System.out.println(obj1 instanceof C);
		System.out.println(obj2 instanceof D);
		System.out.println(obj2 instanceof C);

		int val1 = 5;
		int val2 = 3;
		System.out.println(val1 & val2);
		System.out.println(val1 | val2);
		System.out.println(val1 ^ 2);

		int k = 2;
		switch (k) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Default");
		}

		double l = 0.1;
		double m = 0.2;
		System.out.println(l + m);
		System.out.println(String.format("%.2f", (l + m)));

		StringBuilder sb = new StringBuilder("Hello");
		// final StringBuilder sb = new StringBuilder("Hello"); //Will Work same with
		// final too.
		sb.append(" World");
		System.out.println(sb);

		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] newArr = Arrays.copyOfRange(intArray, 1, 3);
		for (int num : newArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(display());

		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = p1;
		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p1));
		System.out.println(p3 == p1);
		System.out.println(p1 == p2);

		Animal animal = new Dog();
		animal.display();// DOG display
	}
}

class Parent {
	void display() {
		System.out.println("Parent display()");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("Child display()");
	}
}

class StaticTest {
	static void display() {
		System.out.println("Static display()");
	}
}

class OverloadTest {
	void display(int x) {
		System.out.println("Display int: " + x);
	}

	void display(String x) {
		System.out.println("Display String: " + x);
	}
}

class C {
}

class D extends C {
}

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Animal {
	void display() throws Exception {
		System.out.println("Animal display()");
	}
}

class Dog extends Animal {
	void display() throws ArithmeticException {
		System.out.println("Dog display()");
	}
}