package procthree;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class PersonNewNew {
	private String name;
	private int age;

	public PersonNewNew(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PersonNewNew PersonNewNew = (PersonNewNew) o;
		return age == PersonNewNew.age && Objects.equals(name, PersonNewNew.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "PersonNewNew{name='" + name + "', age=" + age + '}';
	}
}

public class HashMapWithCustomKeys {
	public static void main(String[] args) {
		Map<PersonNewNew, String> PersonNewNewMap = new HashMap<>();

		// Adding custom keys to the HashMap
		PersonNewNew PersonNewNew1 = new PersonNewNew("Alice", 30);
		PersonNewNew PersonNewNew2 = new PersonNewNew("Bob", 25);
		PersonNewNew PersonNewNew3 = new PersonNewNew("Charlie", 35);

		PersonNewNewMap.put(PersonNewNew1, "Engineer");
		PersonNewNewMap.put(PersonNewNew2, "Doctor");
		PersonNewNewMap.put(PersonNewNew3, "Artist");

		// Attempt to add a duplicate key
		PersonNewNewMap.put(new PersonNewNew("Alice", 30), "Architect");

		// Size should be 3, as the duplicate key will replace the old value
		System.out.println("Size of PersonNewNewMap: " + PersonNewNewMap.size()); // Output: 3

		// Print all key-value pairs in the HashMap
		for (Map.Entry<PersonNewNew, String> entry : PersonNewNewMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
