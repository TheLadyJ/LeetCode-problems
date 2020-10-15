package main;

public class MinimumDepthOfBinaryTree {

//	Given a binary tree, find its minimum depth.
//
//	The minimum depth is the number of nodes along the shortest path 
//	from the root node down to the nearest leaf node.
//
//	Note: A leaf is a node with no children.
	
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
		MinimumDepthOfBinaryTree test = new MinimumDepthOfBinaryTree();
		
		TreeNode root = new TreeNode(0, new TreeNode(-10, new TreeNode(-20,new TreeNode(-30),null), null), new TreeNode(10));
		System.out.println("Test for minimum depth: "+test.minDepth(root));

	}
	
	 public int minDepth(TreeNode root) {
		 if(root==null)
			 return 0;
	     if(root.left==null && root.right==null)
	    	 return 1;
	     if(root.right==null)
	    	 return minDepth(root.left)+1;
	     if(root.left==null)
	    	 return minDepth(root.right)+1;
	     return Math.min(minDepth(root.left),minDepth(root.right))+1;
	 }

}
