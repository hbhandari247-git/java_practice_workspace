package proc;

import java.io.*;

public class ExternalizationDemo {
	public static void main(String[] args) {
		Person person = new Person("John Doe", 30);

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			oos.writeObject(person);
			System.out.println("Person object serialized: " + person);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
			Person deserializedPerson = (Person) ois.readObject();
			System.out.println("Person object deserialized: " + deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Person implements Externalizable {
	private String name;
	private int age;

	// Default constructor is required for Externalizable
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters and Setters
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
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}
