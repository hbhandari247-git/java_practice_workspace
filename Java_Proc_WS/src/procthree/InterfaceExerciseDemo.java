package procthree;

interface A {
	default void getApp() {
		System.out.println("App printed from A");
	}
}

interface B {
	default void getApp() {
		System.out.println("App printed from B");
	}
}

public class InterfaceExerciseDemo implements A, B {
	@Override
	public void getApp() {
		// You can choose which default method to call or provide a new implementation
		A.super.getApp(); // Calls the getApp() from interface A
		B.super.getApp(); // Calls the getApp() from interface B
		System.out.println("App printed from MyClass");
	}

	public static void main(String args[]) {
		InterfaceExerciseDemo myClass = new InterfaceExerciseDemo();
		myClass.getApp();
	}
}
