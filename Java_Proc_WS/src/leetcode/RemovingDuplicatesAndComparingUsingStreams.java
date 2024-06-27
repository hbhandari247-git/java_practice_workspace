package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RemovingDuplicatesAndComparingUsingStreams {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(20, 85), new Student(22, 75), new Student(20, 90),
				new Student(22, 95), new Student(21, 70), new Student(20, 85) // Duplicate student
		);

		// Removing duplicates
		List<Student> uniqueStudents = students.stream().distinct().collect(Collectors.toList());

		uniqueStudents.forEach(System.out::println);

		List<Student> sortedStudents = students.stream()
				.sorted(Comparator.comparingInt(Student::getAge).thenComparingInt(Student::getMarks))
				.collect(Collectors.toList());

		sortedStudents.forEach(System.out::println);
	}
}

class Student {
	private int age;
	private int marks;

	public Student(int age, int marks) {
		this.age = age;
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return age == student.age && marks == student.marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, marks);
	}

	@Override
	public String toString() {
		return "Student{" + "age=" + age + ", marks=" + marks + '}';
	}

}