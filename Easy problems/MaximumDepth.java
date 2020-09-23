package main;

public class MaximumDepth {
	
//	Given a binary tree, find its maximum depth.
//	The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//	Note: A leaf is a node with no children.
//
//	Example:
//
//	Given binary tree [3,9,20,null,null,15,7],
//
//	    3
//	   / \
//	  9  20
//	    /  \
//	   15   7
//	   
//	return its depth = 3.
	
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
		MaximumDepth test = new MaximumDepth();
		
		
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		
		System.out.println("Input:\r\n" + 
				"    1\r\n" + 
				"   / \\\r\n" + 
				"  2   2\r\n" + 
				"     / \\\r\n" + 
				"    4   3");
		
		System.out.println("Output: "+test.maxDepth(root));

	}
	
	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		return 1+Math.max(maxDepth(root.right), maxDepth(root.left));
	}

}
