package procthree;

import java.util.*;

public class TesterNew {
	public static void main(String[] args) {
		String s1 = "abccddaaeeffg";
		HashMap<String, Integer> stringHashMap = new HashMap<String, Integer>();
		for (int i = 0; i < s1.toCharArray().length; i++) {
			stringHashMap.put("" + s1.charAt(i), stringHashMap.getOrDefault("" + s1.charAt(i), 0) + 1);
		}
		System.out.println(stringHashMap);
	}
}
