package procparttwo;

class Animal {
	public Animal getAnimal() {
		return this;
	}

	@Override
	public String toString() {
		return "This is an Animal";
	}
}

class Dog extends Animal {
	@Override
	public Dog getAnimal() {
		return this;
	}

	@Override
	public String toString() {
		return "This is a Dog";
	}
}

public class CovariantReturnTypesDemo {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dogAsAnimal = new Dog();
		Dog dog = new Dog();

		// Covariant return type in action
		Animal animalResult = animal.getAnimal(); // Returns Animal
		Animal dogAsAnimalResult = dogAsAnimal.getAnimal(); // Returns Dog but as Animal
		Dog dogResult = dog.getAnimal(); // Returns Dog

		System.out.println(animalResult);
		System.out.println(dogAsAnimalResult);
		System.out.println(dogResult);
	}
}
