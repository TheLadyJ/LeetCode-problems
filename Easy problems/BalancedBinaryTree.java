package main;

public class BalancedBinaryTree {
	
//	Given a binary tree, determine if it is height-balanced.
//
//	For this problem, a height-balanced binary tree is defined as:
//
//	a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
	
//	Constraints:
//
//		The number of nodes in the tree is in the range [0, 5000].
//		-104 <= Node.val <= 104
	
	
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
		BalancedBinaryTree test = new BalancedBinaryTree();
		
		TreeNode notAvl = new TreeNode(0, new TreeNode(-10, new TreeNode(-20), null), null);
		TreeNode isAvl = new TreeNode(0, new TreeNode(-10, new TreeNode(-20), null), new TreeNode(10));
		
		System.out.println("Test for the first tree: "+test.isBalanced(notAvl));
		System.out.println("Test for the second tree: "+test.isBalanced(isAvl));
		
	}
	
	public boolean isBalanced(TreeNode root) {
        if(root==null)
        	return true;
        if(Math.abs(height(root.left)-height(root.right))>=2)
        	return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
	
	public int height(TreeNode root) {
		if(root==null)
			return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}

}
