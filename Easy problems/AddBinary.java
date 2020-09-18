package main;

public class AddBinary {

	// Given two binary strings, return their sum (also a binary string).
	//
	// The input strings are both non-empty and contains only characters 1 or 0.

	// Example 1:
	// Input: a = "11", b = "1"
	// Output: "100"
	//
	// Example 2:
	// Input: a = "1010", b = "1011"
	// Output: "10101"

	// Constraints:
	// Each string consists only of '0' or '1' characters.
	// 1 <= a.length, b.length <= 10^4
	// Each string is either "0" or doesn't contain any leading zero.

	public static void main(String[] args) {
		AddBinary test = new AddBinary();
		System.out.println("Input: a = \"11\", b = \"1\"");
		System.out.println("Output: \"" + test.addBinary("11", "1") + "\"");
	}

	public String addBinary(String a, String b) {
		String result = "";
		int add = 0;
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int first = (i < 0) ? 0 : Character.getNumericValue(a.charAt(i));
			int second = (j < 0) ? 0 : Character.getNumericValue(b.charAt(j));
			int num = (first + second + add) % 2;
			add = (first + second + add) / 2;
			result = num + result;
		}

		result = (add == 0) ? result : add + result;
		return result;
	}
}
