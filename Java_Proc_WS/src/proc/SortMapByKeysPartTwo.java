package proc;

//Java Code to sort Map by key value
import java.util.*;
public class SortMapByKeysPartTwo {

	// This map stores unsorted key
	static Map<String, Integer> map = new HashMap<>();

	// function to sort hashmap by keys
	public static Map<String, Integer>
	sortByKey(Map<String, Integer> hm)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer> > list
			= new LinkedList<Map.Entry<String, Integer> >(
				hm.entrySet());

		// Sort the list using lambda expression
		Collections.sort(
			list,
			(i1, i2) -> i1.getKey().compareTo(i2.getKey()));

		// put data from sorted list to hashmap
		HashMap<String, Integer> temp
			= new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
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
		Map<String, Integer> hm1 = sortByKey(map);

		// print the sorted hashmap
		for (Map.Entry<String, Integer> en :
			hm1.entrySet()) {
			System.out.println("Key = " + en.getKey()
							+ ", Value = "
							+ en.getValue());
		}
	}
}
