package procthree;

//Leetcode prob  -2
public class PracticeTester {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		if (carry > 0) {
			current.next = new ListNode(carry);
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		// Example usage:
		PracticeTester solution = new PracticeTester();

		// Construct input linked lists
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		// Call the addTwoNumbers function
		ListNode result = solution.addTwoNumbers(l1, l2);

		// Print the result
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}