package procthree;

/**
 * To find a loop in a singly linked list, you can use Floyd's Cycle Detection
 * Algorithm, also known as the Tortoise and Hare algorithm. This algorithm uses
 * two pointers: one slow pointer (tortoise) and one fast pointer (hare) to
 * traverse the linked list.
 * 
 * @author Himanshu Bhandari
 *
 */

class ListNodeNew {
	int val;
	ListNodeNew next;

	ListNodeNew(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycle {

	public boolean hasCycle(ListNodeNew head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNodeNew slow = head;
		ListNodeNew fast = head.next;

		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false; // No loop
			}
			slow = slow.next; // Move slow pointer one step
			fast = fast.next.next; // Move fast pointer two steps
		}

		return true; // Loop detected
	}

	public static void main(String[] args) {
		LinkedListCycle solution = new LinkedListCycle();

		// Example usage:
		ListNodeNew head = new ListNodeNew(3);
		head.next = new ListNodeNew(2);
		head.next.next = new ListNodeNew(0);
		head.next.next.next = new ListNodeNew(-4);
		head.next.next.next.next = head.next; // Create a loop

		if (solution.hasCycle(head)) {
			System.out.println("The linked list contains a cycle.");
		} else {
			System.out.println("The linked list does not contain a cycle.");
		}
	}
}
