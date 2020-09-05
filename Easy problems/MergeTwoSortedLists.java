package main;

public class MergeTwoSortedLists {

	// Merge two sorted linked lists and return it as a new sorted list. The new
	// list should be made by splicing together the nodes of the first two lists.

	/*
	 * Example: Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
	 */

	// Definition for singly-linked list.
	// public class ListNode {
	// int val;
	// ListNode next;
	// ListNode() {}
	// ListNode(int val) { this.val = val; }
	// ListNode(int val, ListNode next) { this.val = val; this.next = next; } }

	public static void main(String[] args) {
		MergeTwoSortedLists test = new MergeTwoSortedLists();
		ListNode l1 = null;
		ListNode l2 = new ListNode(0);
		test.printList(test.mergeTwoLists(l1, l2));
		test.printList(l2);
	}
	
	public void printList(ListNode head) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		ListNode n=head;
		System.out.print(n.val);
		n=n.next;
		while(n!=null) {
			System.out.print(" -> "+n.val);
			n=n.next;
		}
		System.out.println();
	}
	

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result=new ListNode();
        ListNode temp=result;
        if(l1==null && l2==null)
            return null;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.val=l1.val;
                l1=l1.next;
            }
            else{
                temp.val=l2.val;
                l2=l2.next;
            }
            temp.next=new ListNode();
            temp=temp.next;
        }
        if(l1!=null){
            temp.val=l1.val;
            temp.next=l1.next;
        }
        else if(l2!=null){
            temp.val=l2.val;
            temp.next=l2.next;
        }
        return result;
		
	}
	

	

}
