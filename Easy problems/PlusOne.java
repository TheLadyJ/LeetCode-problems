package main;

public class PlusOne {

	// Given a non-empty array of digits representing a non-negative integer,
	// increment one to the integer.
	// The digits are stored such that the most significant digit is at the head of
	// the list,
	// and each element in the array contains a single digit.
	//
	// You may assume the integer does not contain any leading zero, except the
	// number 0 itself.

	// Example 1:
	// Input: digits = [1,2,3]
	// Output: [1,2,4]
	// Explanation: The array represents the integer 123.
	//
	// Example 2:
	// Input: digits = [4,3,2,1]
	// Output: [4,3,2,2]
	// Explanation: The array represents the integer 4321.
	//
	// Example 3:
	// Input: digits = [0]
	// Output: [1]

	// Constraints:
	// 1 <= digits.length <= 100
	// 0 <= digits[i] <= 9

	public static void main(String[] args) {
		PlusOne test = new PlusOne();

		int[] input = { 1, 2, 3 };
		System.out.println("Input: digits = [1,2,3]");
		System.out.print("Output: ");
		test.printArray(test.plusOne(input));
		;
	}

	public void printArray(int[] ar) {
		System.out.print("[");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			if (i != ar.length - 1)
				System.out.print(",");
		}
		System.out.println("]");
	}

	public int[] plusOne(int[] digits) {
		return plusOneR(digits, digits.length - 1);
	}

	// In this recursive method int i will be used for incrementing the last digit
	public int[] plusOneR(int[] digits, int i) {
		// If number consists only of digit 9
		if (i == 0 && digits[i] == 9) {
			// We will have to create a new array with incremented length
			int[] temp = new int[digits.length + 1];
			// First digit will then be 1 and the rest of them are automatically set to 0
			temp[0] = 1;
			// We can now return that array
			return temp;
		}
		// When we have a digit 9 we must also increment a digit right from that one
		if (digits[i] == 9) {
			// 9 becomes 0
			digits[i] = 0;
			// And we continue to the next right digit to increment it
			return plusOneR(digits, i - 1);
		}
		// If digit isn't 9, we can simply increment it and return the array
		digits[i] += 1;
		return digits;
	}

}
