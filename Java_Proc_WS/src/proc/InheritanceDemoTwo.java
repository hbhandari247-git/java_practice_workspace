package proc;

public class InheritanceDemoTwo {

	// Main function
	public static void main(String args[]) {

		Employee1 e1 = new Employee1();
		e1.set_Emp(1001, "Manjeet", "AP", 20000);
		e1.disp_Emp();
	}
}

//Java Program to demonstrate 
//Java Inheritance

//Parent Class
class Person1 {
	// Variables
	int id;
	String name;

	// Java Methods
	void set_Person(int id, String name) {
		try {
			this.id = id;
			this.name = name;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void disp_Person() {
		System.out.print(id + "\t" + name + "\t");
	}
}

//Child Class
class Employee1 extends Person1 {
	int sal;
	String desgn;

	void set_Emp(int id, String name, String desgn, int sal) {
		try {
			set_Person(id, name);
			this.desgn = desgn;
			this.sal = sal;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void disp_Emp() {
		disp_Person();
		System.out.print(desgn + "\t" + sal);
	}

}
