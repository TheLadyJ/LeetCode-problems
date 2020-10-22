package main;

public class PathSum {
	
	
//	Given a binary tree and a sum, determine if the tree has a root-to-leaf path such 
//	that adding up all the values along the path equals the given sum.
//
//	Note: A leaf is a node with no children.
//
//	Example:
//
//	Given the below binary tree and sum = 22,
//
//	      5
//	     / \
//	    4   8
//	   /   / \
//	  11  13  4
//	 /  \      \
//	7    2      1
//	return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
	
	
	
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
		PathSum test = new PathSum();
		TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11,new TreeNode(7),new TreeNode(2)), null), new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));
		
		System.out.println("Given tree: \n"
				+ "	      5\r\n" + 
				"	     / \\\r\n" + 
				"	    4   8\r\n" + 
				"	   /   / \\\r\n" + 
				"	  11  13  4\r\n" + 
				"	 /  \\      \\\r\n" + 
				"	7    2      1\n");
		System.out.println("hasPathSum(22) -> "+test.hasPathSum(root, 22));
		System.out.println("hasPathSum(10) -> "+test.hasPathSum(root, 10));
		System.out.println("hasPathSum(18) -> "+test.hasPathSum(root, 18));
		
		
	}
	
	/* Another solution
	  public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
           return false;
       } 
       
        if(root.left == null && root.right == null) {
            return sum == root.val;
        }
        
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
    */
	
	public boolean hasPathSum(TreeNode root, int sum) {
        return sum(sum,0,root);
    }
	
	public boolean sum(int sum, int add, TreeNode root) {
		if(root==null)
        	return false;
		add+=root.val;
        if(root.left==null&&root.right==null) 
        	return sum==add;
        return sum(sum,add,root.left)||sum(sum,add,root.right);
	}
	
	

}
