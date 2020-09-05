package main;

import java.util.Stack;

public class ValidParentheses {

	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 */

	/*
	 * Example 1: Input: s = "()" Output: true
	 * 
	 * Example 2: Input: s = "()[]{}" Output: true
	 * 
	 * Example 3: Input: s = "(]" Output: false
	 * 
	 * Example 4: Input: s = "([)]" Output: false
	 * 
	 * Example 5: Input: s = "{[]}" Output: true
	 */

	/*
	 * Constraints:
	 * 
	 * 1) 1 <= s.length <= 104 2) s consists of parentheses only '()[]{}'.
	 */

	public static void main(String[] args) {
		ValidParentheses test = new ValidParentheses();
		System.out.println(test.isValid("()"));

	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int i;
		try {
			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
					stack.push(s.charAt(i));
				else if (s.charAt(i) == ')' && stack.peek() == '(')
					stack.pop();
				else if (s.charAt(i) == ']' && stack.peek() == '[')
					stack.pop();
				else if (s.charAt(i) == '}' && stack.peek() == '{')
					stack.pop();
				else
					return false;
			}
		} catch (Exception e) {
			return false;
		}
		if (stack.empty())
			return true;
		return false;
	}

}
