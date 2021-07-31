package main;

public class ValidPalindrome {

	/*
	 * Given a string s, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
	 * "amanaplanacanalpanama" is a palindrome.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
	 * palindrome.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 2 * 105 s consists only of printable ASCII characters.
	 */

	public static void main(String[] args) {
		ValidPalindrome test = new ValidPalindrome();
		System.out.println(test.isPalindrome("0A man, a plan, a canal: Panama0"));
		System.out.println(test.isPalindrome("race a car"));

	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (!Character.isLetterOrDigit(s.charAt(i)) && i < j)
				i++;
			while (!Character.isLetterOrDigit(s.charAt(j)) && j > i)
				j--;
			if (s.charAt(i++) != s.charAt(j--))
				return false;
		}
		return true;
	}

}
