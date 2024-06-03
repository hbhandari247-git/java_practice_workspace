package procparttwo;

public class RegexExperssionsDemo {
	public static void main(String[] args) {
		String stringValue = "abc123@gmail.com";
		String regex1 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		String regex2 = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
		System.out.println(stringValue.matches(regex1));
		System.out.println(stringValue.matches(regex2));
	}
}