package proc;

public class StringPools {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "user";
		String s3 = s1.concat(s2);
		String s4 = new String("javauser");
		String s5 = "java";
		String s6 = new String("javauser");

		System.out.println(s1 == s5);
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4.intern()));
		System.out.println(s6.intern().equals(s4.intern()));
		System.out.println(s6.equals(s4));
		System.out.println(s6 == s4);
	}

}
