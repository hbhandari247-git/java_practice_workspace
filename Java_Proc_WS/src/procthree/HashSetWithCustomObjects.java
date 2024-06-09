package procthree;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
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
		Person person = (Person) o;
		return age == person.age && Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}

public class HashSetWithCustomObjects {
	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();

		// Adding custom objects to the HashSet
		personSet.add(new Person("Alice", 30));
		personSet.add(new Person("Bob", 25));
		personSet.add(new Person("Charlie", 35));

		// Attempt to add duplicate custom object
		personSet.add(new Person("Alice", 30));

		// Size should be 3, as the duplicate object is not added
		System.out.println("Size of personSet: " + personSet.size()); // Output: 3

		// Print all elements in the HashSet
		for (Person person : personSet) {
			System.out.println(person);
		}
	}
}
