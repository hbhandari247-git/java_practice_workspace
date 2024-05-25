package proc;

/**
 * 
 * 
 * What if main method is not static?
 * Error: Main method is not static in class proc.TesterThree, please define the main method as:
   public static void main(String[] args)
 *
 * What if main method is not void?
 *Error: Main method must return a value of type void in class proc.TesterThree, please define the main method as:
   public static void main(String[] args)
 *
 */

public class TesterThree {

	public static void main(String[] args) {
		System.out.println("MAIN METHOD IS STATIC");

	}
	
	/*public void main(String[] args) {
		System.out.println("MAIN METHOD IS NOT STATIC");

	}*/
}
