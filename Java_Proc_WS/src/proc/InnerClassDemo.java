package proc;

class OuterClassDemo {
	int x = 10;

	class InnerClass {
		int y = 5;
		
		public int printOuterClassVariable() {
			return x;
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClassDemo myOuter = new OuterClassDemo();
		OuterClassDemo.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
		System.out.println(myInner.printOuterClassVariable());
	}
}
