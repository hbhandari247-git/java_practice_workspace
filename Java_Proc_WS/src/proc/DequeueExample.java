package proc;

import java.util.ArrayDeque;

public class DequeueExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<>();

		// Adding elements to the deque
		deque.add(10);
		deque.addFirst(20);
		deque.addLast(30);
		deque.push(40);
		deque.offer(50);
		deque.offerFirst(60);

		// Printing the elements
		System.out.println("Deque: " + deque);

		// Removing elements from the deque
		System.out.println("Removed first: " + deque.removeFirst());
		System.out.println("Removed last: " + deque.removeLast());

		// Printing the elements again
		System.out.println("Deque after removals: " + deque);
	}
}
