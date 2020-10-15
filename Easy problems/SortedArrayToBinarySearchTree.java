package main;

public class SortedArrayToBinarySearchTree {
	
//	Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
//
//	For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of 
//	the two subtrees of every node never differ by more than 1.
//
//	Example:
//
//	Given the sorted array: [-10,-3,0,5,9],
//
//	One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
//
//	      0
//	     / \
//	   -3   9
//	   /   /
//	 -10  5
	
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */

	public static void main(String[] args) {
		SortedArrayToBinarySearchTree test = new SortedArrayToBinarySearchTree();
		
		TreeNode root = test.sortedArrayToBST(new int[] {-10,-3,0,5,9});
		test.printTree(root);
		
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
	        return toAVL(nums, 0, nums.length-1);
	   }
	
	public void printTree(TreeNode root) {
		if(root==null)
			return;
		System.out.println(root.val);
		printTree(root.left);
		printTree(root.right);
	}
	
	public TreeNode toAVL(int[] nums, int start, int end) {
		if(start>end) {
			return null;
		}
		if(start==end) {
			return new TreeNode(nums[start]);
		}
		int middle = (start+end)/2;
		
		return new TreeNode(nums[middle], toAVL(nums, start, middle-1), toAVL(nums, middle+1, end));
	}
	

}
