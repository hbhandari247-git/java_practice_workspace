package proc;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strArray1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
		String[] strArray2 = { "" };
		String[] strArray3 = { "a" };

		System.out.println(groupAnagrams(strArray1));
		System.out.println(groupAnagrams(strArray2));
		System.out.println(groupAnagrams(strArray3));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);

			if (!map.containsKey(sortedWord)) {
				map.put(sortedWord, new ArrayList<>());
			}

			map.get(sortedWord).add(word);
		}

		return new ArrayList<>(map.values());
	}

}
