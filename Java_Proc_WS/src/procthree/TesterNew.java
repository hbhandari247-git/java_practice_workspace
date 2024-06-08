package procthree;

import java.util.IdentityHashMap;
import java.util.Map;

public class TesterNew {
	public static void main(String[] args) {
		Integer i1 = 1000;
		Integer i2 = 1000;
		int i3 = 100;
		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		System.out.println(i2 == i3);
		System.out.println(Integer.MAX_VALUE);

		Map<String, String> map = new IdentityHashMap<>();

		// Creating two different instances of String with the same value
		String key1 = new String("key");
		String key2 = new String("key");

		// Adding the key-value pairs to the IdentityHashMap
		map.put(key1, "value1");
		map.put(key2, "value2");

		// Checking the size of the map
		System.out.println("Size of map: " + map.size()); // Output: 2

		// Checking the values associated with the keys
		System.out.println("Value for key1: " + map.get(key1)); // Output: value1
		System.out.println("Value for key2: " + map.get(key2)); // Output: value2
	}
}
