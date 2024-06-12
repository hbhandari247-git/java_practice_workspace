package leetcode;

import java.util.Stack;

class MinStackClass {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	/** initialize your data structure here. */
	public MinStackClass() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		int popped = stack.pop();
		if (popped == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

}

public class MinStack {
	public static void main(String[] args) {
		MinStackClass minStack = new MinStackClass();

		minStack.push(2);
		minStack.push(3);
		minStack.push(7);
		minStack.push(5);

		System.out.println("Minimum element: " + minStack.getMin()); // Output: 2
		System.out.println("Top element: " + minStack.top()); // Output: 2

		minStack.pop();

		System.out.println("Minimum element after popping: " + minStack.getMin()); // Output: 3
		System.out.println("Top element after popping: " + minStack.top()); // Output: 7
	}
}