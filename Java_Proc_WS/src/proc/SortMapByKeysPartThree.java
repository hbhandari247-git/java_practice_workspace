package proc;

//Java Code to sort Map by key value
import static java.util.stream.Collectors.*;

import java.lang.*;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class SortMapByKeysPartThree {

	// This map stores unsorted values
	static Map<String, Integer> map = new HashMap<>();

	// Function to sort map by Key
	public static void sortbykey()
	{
		HashMap<String, Integer> temp
			= map.entrySet()
				.stream()
				.sorted((i1, i2)
							-> i1.getKey().compareTo(
								i2.getKey()))
				.collect(Collectors.toMap(
					Map.Entry::getKey,
					Map.Entry::getValue,
					(e1, e2) -> e1, LinkedHashMap::new));

		// Display the HashMap which is naturally sorted
		for (Map.Entry<String, Integer> entry :
			temp.entrySet()) {
			System.out.println("Key = " + entry.getKey()
							+ ", Value = "
							+ entry.getValue());
		}
	}

	// Driver Code
	public static void main(String args[])
	{
		// putting values in the Map
		map.put("Jayant", 80);
		map.put("Abhishek", 90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish", 40);

		// Calling the function to sortbyKey
		sortbykey();
	}
}
