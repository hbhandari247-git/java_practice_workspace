package springframeworkdemo;

//Java Program to Illustrate VodafoneIdea Class

//Class
//Implementing Sim interface
public class VodafoneIdea implements Sim {

	@Override public void calling()
	{
		System.out.println("VodafoneIdea Calling");
	}

	@Override public void data()
	{
		System.out.println("VodafoneIdea Data");
	}
}