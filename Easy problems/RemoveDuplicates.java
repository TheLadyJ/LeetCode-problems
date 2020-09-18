package main;

public class RemoveDuplicates {

	// Given a sorted linked list, delete all duplicates such that each element
	// appear only once.
	//
	// Example 1:
	// Input: 1->1->2
	// Output: 1->2
	//
	// Example 2:
	// Input: 1->1->2->3->3
	// Output: 1->2->3

	public static void main(String[] args) {
		RemoveDuplicates test = new RemoveDuplicates();
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3)))));
		System.out.print("Input: ");
		test.printList(head);

		test.deleteDuplicates(head);
		System.out.print("Output: ");
		test.printList(head);
	}

	public void printList(ListNode head) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		ListNode n = head;
		System.out.print(n.val);
		n = n.next;
		while (n != null) {
			System.out.print(" -> " + n.val);
			n = n.next;
		}
		System.out.println();
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;

		ListNode n = head;
		while (n.next != null) {
			if (n.val == n.next.val) {
				n.next = n.next.next;
			} else
				n = n.next;
		}
		return head;
	}

}
