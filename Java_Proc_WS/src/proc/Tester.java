package proc;
//
//public class Tester {
//
//	public static void main(String[] args) {
//		/**
//		 * Heap memory is used by all the parts of the application 
//		 * whereas stack memory is used only by one thread of execution.
//		 * Whenever an object is created, it's always stored in the Heap space
//		 * and stack memory contains the reference to it.
//		 */
//		/* Exception Handling Questions */
//		/* Q-1: int type is not compatible with Throwable class. Compilation error
//		 * try {
//			throw 10;
//		}
//		catch(int e) {
//			System.out.println("Got the Exception " + e);
//		}
//		*/
//		/* Q-2: Test extends exception class, will be caught in catch block
//		 * and finally will execute anyway.
//		 */
//		/*
//		 * try {
//			throw new Test();
//		} catch (Test t) {
//			System.out.println("Got the Test Exception");
//		} finally {
//			System.out.println("Inside finally block ");
//		}*
//		*/
//		/* Base class exception is caught first , compile time error
//		try {
//			// Some monitored code
//			throw new Derived();
//		} catch (Base b) {
//			System.out.println("Caught base class exception");
//		} catch (Derived d) {
//			System.out.println("Caught derived class exception");
//		} */
//		
//        /*try
//        {
//            int a[]= {1, 2, 3, 4};
//            for (int i = 1; i <= 4; i++)
//            {
//                System.out.println ("a[" + i + "]=" + a[i] + "\n");
//            }
//        }
//          
//        catch (Exception e)
//        {
//            System.out.println ("error = " + e);
//        }
//          
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println ("ArrayIndexOutOfBoundsException");
//        }*/
//	}
//
//}
//
//
//class Test extends Exception {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L; }
//
//class Derived extends Base {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L; }
//
//
//class Base extends Exception {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L; }

public class Tester {
	String str = "a";

	void A() {
		try {
			str += "b";
			B();
		} catch (Exception e) {
			str += "c";
		}
	}

	void B() throws Exception {
		try {
			str += "d";
			C();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			str += "e";
		}

		str += "f";

	}

	void C() throws Exception {
		throw new Exception();
	}

	void display() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Tester object = new Tester();
		object.A();
		object.display();
	}

}