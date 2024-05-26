package threaddemo;

public class GarbageCollectionDemo {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		GarbageCollectionDemo s1 = new GarbageCollectionDemo();
		GarbageCollectionDemo s2 = new GarbageCollectionDemo();
		s1 = null;
		s2 = null;
		System.gc();
	}
}