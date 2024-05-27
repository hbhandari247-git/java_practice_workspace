package beanscopedemo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// Load the Spring XML configuration
		// file into IoC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/beans.xml");

		// Get the "HelloWorld" bean object
		// and call getName() method
		HelloWorld helloWorld1 = (HelloWorld) ap.getBean("hw");

		// Set the name
		helloWorld1.setName("Srinivas");

		System.out.println("Hello object (hello1)" + " Your name is: " + helloWorld1.getName());

		// Get another "HelloWorld" bean object
		// and call getName() method
		HelloWorld helloWorld2 = (HelloWorld) ap.getBean("hw");

		// Set the name
		helloWorld1.setName("Himanshu");

		System.out.println("Hello object (hello2)" + "Your name is: " + helloWorld2.getName());

		// Now compare the references to see
		// whether they are pointing to the
		// same object or different object
		System.out.println("'helloWorld1' and 'helloWorld2'" + "are referring " + "to the same object: "
				+ (helloWorld1 == helloWorld2));

		// Print the address of both
		// object Geeks1 and Geeks2
		System.out.println("Address of object helloWorld1: " + helloWorld1);
		System.out.println("Address of object helloWorld2: " + helloWorld2);
	}
}
