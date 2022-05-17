package main;

public class LinkedListCycle {

//	Given head, the head of a linked list, determine if the linked list has a cycle in it.
//	There is a cycle in a linked list if there is some node in the list that can be reached 
//	again by continuously following the next pointer. 
//	Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
//	Note that pos is not passed as a parameter.

//	Return true if there is a cycle in the linked list. Otherwise, return false.

//	Example 1:
//	Input: head = [3,2,0,-4], pos = 1
//	Output: true
//	Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

//	Example 2:
//	Input: head = [1,2], pos = 0
//	Output: true
//	Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

//	Example 3:
//	Input: head = [1], pos = -1
//	Output: false
//	Explanation: There is no cycle in the linked list.

//	Constraints:
//	The number of the nodes in the list is in the range [0, 104].
//	-10^5 <= Node.val <= 10^5
//	pos is -1 or a valid index in the linked-list.

//	Follow up: Can you solve it using O(1) (i.e. constant) memory?

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode node1_1 = new ListNode(3);
		ListNode node1_2 = new ListNode(0);
		ListNode node1_3 = new ListNode(4);

		node1_3.next = node1_1;
		node1_2.next = node1_3;
		node1_1.next = node1_2;
		head1.next = node1_1;

		// Should be true
		System.out.println(hasCycle(head1));

		ListNode head2 = new ListNode(1);
		ListNode node2_1 = new ListNode(3);
		ListNode node2_2 = new ListNode(0);
		ListNode node2_3 = new ListNode(4);

		node2_3.next = null;
		node2_2.next = node2_3;
		node2_1.next = node2_2;
		head2.next = node2_1;

		// Should be false
		System.out.println(hasCycle(head2));

		ListNode head3 = new ListNode(8);

		head3.next = head3;

		// Should be true
		System.out.println(hasCycle(head3));

		ListNode head4 = new ListNode(8);

		head4.next = null;

		// Should be false
		System.out.println(hasCycle(head4));

		ListNode head5 = null;

		// Should be false
		System.out.println(hasCycle(head5));
	}

	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;
	}

}
