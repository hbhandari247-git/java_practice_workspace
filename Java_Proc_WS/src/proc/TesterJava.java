package proc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TesterJava {
	public static void main(String[] args) {
		String s1 = "GeeksForGeeks";
		String s2 = "";
		String s3 = "";

		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s1.length(); i++) {
			int counter = 0;
			if (!hashMap.containsKey(s1.charAt(i))) {
				counter = counter + 1;
				hashMap.put(s1.charAt(i), counter);
			} else {
				Integer countTemp = hashMap.get(s1.charAt(i));
				countTemp = countTemp + 1;
				hashMap.put(s1.charAt(i), countTemp++);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet() ) {
			if (entry.getValue().equals(1)) {
				s2 = s2 + entry.getKey();
				break;
			}
		}

		System.out.println(s2);
		System.out.println(hashMap);
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);

			if (s1.indexOf(c) == s1.lastIndexOf(c)) {
				s3 = s3 + c;
				break;
			}
		}
		System.out.println(s3);
	}
}
