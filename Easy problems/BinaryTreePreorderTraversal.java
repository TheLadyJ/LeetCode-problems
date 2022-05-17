package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

//	Given the root of a binary tree, return the preorder traversal of its nodes' values.
//
//	Example 1:
//	Input: root = [1,null,2,3]
//	Output: [1,2,3]
//		
//	Example 2:
//	Input: root = []
//	Output: []
//		
//	Example 3:
//	Input: root = [1]
//	Output: [1] 
//
//	Constraints:
//	The number of nodes in the tree is in the range [0, 100].
//	-100 <= Node.val <= 100	 
//
//	Follow up: Recursive solution is trivial, could you do it iteratively?

	public static void main(String[] args) {
		TreeNode node4 = new TreeNode(4);
		TreeNode node3 = new TreeNode(3, node4, null);
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2, node3, node5);
		TreeNode node7 = new TreeNode(7);
		TreeNode node6 = new TreeNode(6, null, node7);
		TreeNode root = new TreeNode(1, node2, node6);
				
		//In both cases it prints: [1, 2, 3, 4, 5, 6, 7]
		
		List<Integer> resultIterative = preorderTraversal(root);
		System.out.println(resultIterative);
		
		List<Integer> resultRecursive = new ArrayList<Integer>();
		preorderTraversalRecursive(root,resultRecursive);
		System.out.println(resultRecursive);
	}

	// Iterative algorithm
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> nodesToGoRight = new Stack<>();
		while (root != null) {
			result.add(root.val);
			if (root.left != null) {
				if (root.right != null) {
					nodesToGoRight.push(root);
				}
				root = root.left;
			} else if (root.right != null) {
				root = root.right;
			} else if (!nodesToGoRight.empty()) {
				root = nodesToGoRight.pop().right;

			} else {
				root = null;
			}
		}
		return result;
	}

	// Recursive algorithm
	public static void preorderTraversalRecursive(TreeNode node, List<Integer> result) {
		if (node == null)
			return;

		result.add(node.val);
		preorderTraversalRecursive(node.left, result);
		preorderTraversalRecursive(node.right, result);
	}
}
