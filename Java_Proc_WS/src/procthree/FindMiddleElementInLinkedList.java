package procthree;

class ListNodeNewNew {
	int value;
	ListNodeNewNew next;

	ListNodeNewNew(int value) {
		this.value = value;
		this.next = null;
	}
}

public class FindMiddleElementInLinkedList {
	ListNodeNewNew head;

	public FindMiddleElementInLinkedList() {
		this.head = null;
	}

	// Function to add a new node at the end of the list
	public void add(int value) {
		ListNodeNewNew newNode = new ListNodeNewNew(value);
		if (head == null) {
			head = newNode;
		} else {
			ListNodeNewNew current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	// Function to find the middle element of the linked list
	public ListNodeNewNew findMiddle() {
		if (head == null) {
			return null;
		}
		ListNodeNewNew slow = head;
		ListNodeNewNew fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		FindMiddleElementInLinkedList list = new FindMiddleElementInLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//list.add(6);

		ListNodeNewNew middle = list.findMiddle();
		if (middle != null) {
			System.out.println("The middle element is: " + middle.value); // Output: The middle element is: 3
		} else {
			System.out.println("The list is empty.");
		}
	}
}
