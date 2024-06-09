package procthree;

public class MethodOverloadingTest {
	public static void main(String[] args) {
		System.out.println(displayMessage(null));
	}

	public static String displayMessage(String s1) {
		return "String method called";
	}

	public static String displayMessage(Object o1) {
		return "Object method called";
	}
}
