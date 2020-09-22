package main;

public class SameTree {

//	Given two binary trees, write a function to check if they are the same or not.
//	Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

//	Example 1:
//
//	Input:     1         1
//	          / \       / \
//	         2   3     2   3
//
//	        [1,2,3],   [1,2,3]
//
//	Output: true
	
	
//	Example 2:
//
//	Input:     1         1
//	          /           \
//	         2             2
//
//	        [1,2],     [1,null,2]
//
//	Output: false
	
	
//	Example 3:
//
//	Input:     1         1
//	          / \       / \
//	         2   1     1   2
//
//	        [1,2,1],   [1,1,2]
//
//	Output: false
	
	
	
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
		SameTree test = new SameTree();
		TreeNode tree1=new TreeNode(1, new TreeNode(2),	new TreeNode(3));
		TreeNode tree2=new TreeNode(1, new TreeNode(2),	new TreeNode(3));
		
		System.out.println("Input:     1         1\r\n" + 
				"          / \\       / \\\r\n" + 
				"         2   3     2   3\r\n" + 
				"\r\n" + 
				"       [1,2,3],   [1,2,3]");
		
		System.out.println("Output: "+test.isSameTree(tree1, tree2));
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
        	return true;
        if(p==null&&q!=null||p!=null&&q==null||p.val!=q.val)
        	return false;
        boolean right=isSameTree(p.right, q.right);
        boolean left=isSameTree(p.left, q.left);
        
        return right&&left;
    }

}
