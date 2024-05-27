package springframeworkdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		
		// Get the bean
		Sim sim1 = applicationContext.getBean("sim1", Sim.class);
		Sim sim2 = applicationContext.getBean("sim2", Sim.class);
		Sim sim3 = applicationContext.getBean("sim3", Sim.class);
		
		// Calling the methods
		sim1.calling();
		sim1.data();
		
		sim2.calling();
		sim2.data();
		
		sim3.calling();
		sim3.data();
	}
}
