package proc;

//Java program to illustrate
//Concept of Composition

import java.util.*;

//Class 1
//Department class
class DepartmentEntity {

	// Attributes of Department
	public String departmentName;

	// Constructor of Department class
	public DepartmentEntity(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}
}

//Class 2
//Company class
class Company {

	// Reference to refer to list of books
	@SuppressWarnings("unused")
	private String companyName;
	private List<DepartmentEntity> departments;

	// Constructor of Company class
	public Company(String companyName) {
		this.companyName = companyName;
		this.departments = new ArrayList<DepartmentEntity>();
	}

	// Method
	// to add new Department to the Company
	public void addDepartment(DepartmentEntity department) {
		departments.add(department);
	}

	public List<DepartmentEntity> getDepartments() {
		return new ArrayList<>(departments);
	}

	// Method
	// to get total number of Departments in the Company
	public int getTotalDepartments() {
		return departments.size();
	}
}

//Class 3
//Main class
public class CompositionExample {

	// Main driver method
	public static void main(String[] args) {
		// Creating a Company object
		Company techCompany = new Company("Tech Corp");

		techCompany.addDepartment(new DepartmentEntity("Engineering"));
		techCompany.addDepartment(new DepartmentEntity("Operations"));
		techCompany.addDepartment(new DepartmentEntity("Human Resources"));
		techCompany.addDepartment(new DepartmentEntity("Finance"));

		int d = techCompany.getTotalDepartments();
		System.out.println("Total Departments: " + d);

		System.out.println("Department names: ");
		for (DepartmentEntity dept : techCompany.getDepartments()) {
			System.out.println("- " + dept.getDepartmentName());
		}
	}
}
