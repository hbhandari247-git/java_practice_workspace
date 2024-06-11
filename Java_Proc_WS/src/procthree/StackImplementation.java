package procthree;

public class StackImplementation {
	private int maxSize;
	private int[] StackImplementationArray;
	private int top;

	public StackImplementation(int size) {
		this.maxSize = size;
		this.StackImplementationArray = new int[maxSize];
		this.top = -1;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("StackImplementation is full. Cannot push " + value);
		} else {
			StackImplementationArray[++top] = value;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("StackImplementation is empty. Cannot pop");
			return -1; // or throw exception
		} else {
			return StackImplementationArray[top--];
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("StackImplementation is empty. Cannot peek");
			return -1; // or throw exception
		} else {
			return StackImplementationArray[top];
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public int size() {
		return top + 1;
	}

	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("Top element is: " + stack.peek());
		System.out.println("StackImplementation size is: " + stack.size());

		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());

		System.out.println("Top element after pop: " + stack.peek());
		System.out.println("StackImplementation size after pop: " + stack.size());

		stack.push(60);
		System.out.println("Top element after push: " + stack.peek());
		System.out.println("StackImplementation size after push: " + stack.size());
	}
}
