package main;

public class SymmetricTree {
	
//	Given a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//	For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

//	Input:
// 		1
//	   / \
//	  2   2
//	 / \ / \
//	3  4 4  3
	 

//	But the following [1,2,2,null,3,null,3] is not:
//
//	    1
//	   / \
//	  2   2
//	   \   \
//	   3    3
	
	
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
		SymmetricTree test = new SymmetricTree();
		
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		
		System.out.println("Input:\r\n" + 
				"    1\r\n" + 
				"   / \\\r\n" + 
				"  2   2\r\n" + 
				" / \\ / \\\r\n" + 
				"3  4 4  3");
		
		System.out.println("Output: "+test.isSymmetric(root));
	}
	
	 public boolean isSymmetric(TreeNode root) {
	        return isSymmetricRec(root, root);
	 }
	 
	 private boolean isSymmetricRec(TreeNode root1,TreeNode root2) {
		 if(root1==null&&root2==null)
			 return true;
		 if(root1==null&&root2!=null||root1!=null&&root2==null||root1.val!=root2.val)
			 return false;
		 
		 boolean check1=isSymmetricRec(root1.left, root2.right);
		 boolean check2=isSymmetricRec(root1.right, root2.left);
		 
		 return check1&&check2;
	 }

}
