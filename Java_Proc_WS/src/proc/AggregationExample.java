package proc;

//Java program to illustrate
//Concept of Aggregation

import java.util.*;

//Class 1
//Student class
class Gakusei {

	// Attributes of Student
	private String studentName;
	private int studentId;

	// Constructor of Student class
	public Gakusei(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}

	public int getstudentId() {
		return studentId;
	}

	public String getstudentName() {
		return studentName;
	}
}

//Class 2
//Department class 
//Department class contains list of Students
class Department {

	private List<Gakusei> students;

	// Constructor of Department class
	public Department(String deptName, List<Gakusei> students) {
		this.students = students;
	}

	public List<Gakusei> getStudents() {
		return students;
	}

	public void addStudent(Gakusei student) {
		students.add(student);
	}
}

//Class 3
//Institute class
//Institute class contains the list of Departments
class Institute {

	private List<Department> departments;

	// Constructor of Institute class
	public Institute(String instituteName, List<Department> departments) {
		this.departments = departments;
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}

	// Method of Institute class
	// Counting total students in the institute
	@SuppressWarnings("unused")
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Gakusei> students = null;

		for (Department dept : departments) {
			students = dept.getStudents();

			for (Gakusei s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}

//Class 4
//main class
public class AggregationExample {

	// main driver method
	public static void main(String[] args) {
		// Creating independent Student objects
		Gakusei s1 = new Gakusei("Parul", 1);
		Gakusei s2 = new Gakusei("Sachin", 2);
		Gakusei s3 = new Gakusei("Priya", 1);
		Gakusei s4 = new Gakusei("Rahul", 2);

		// Creating an list of CSE Students
		List<Gakusei> cse_students = new ArrayList<Gakusei>();
		cse_students.add(s1);
		cse_students.add(s2);

		// Creating an initial list of EE Students
		List<Gakusei> ee_students = new ArrayList<Gakusei>();
		ee_students.add(s3);
		ee_students.add(s4);

		// Creating Department object with a Students list
		// using Aggregation (Department "has" students)
		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);

		// Creating an initial list of Departments
		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

		// Creating an Institute object with Departments list
		// using Aggregation (Institute "has" Departments)
		Institute institute = new Institute("BITS", departments);

		// Display message for better readability
		System.out.print("Total students in institute: ");

		// Calling method to get total number of students
		// in the institute and printing on console
		System.out.print(institute.getTotalStudentsInInstitute());
	}
}
