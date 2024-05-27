package springframeworkdemo;

//Java Program to Illustrate Airtel Class

//Class
//Implementing Sim interface
public class Airtel implements Sim {

	@Override public void calling()
	{
		System.out.println("Airtel Calling");
	}

	@Override public void data()
	{
		System.out.println("Airtel Data");
	}
}
