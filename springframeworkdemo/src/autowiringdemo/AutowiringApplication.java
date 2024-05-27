package autowiringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		City cty = applicationContext.getBean("city", City.class);
		cty.setId(01);
		cty.setName("Panipat");
		State st = applicationContext.getBean("state", State.class);
		st.setName("Haryana");
		cty.setState(st);
		cty.showCityDetails();
	}
}