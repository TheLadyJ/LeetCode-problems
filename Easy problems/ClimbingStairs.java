package main;

public class ClimbingStairs {

	// You are climbing a stair case. It takes n steps to reach to the top.
	// Each time you can either climb 1 or 2 steps. In how many distinct ways can
	// you climb to the top?

	// Example 1:
	// Input: 2
	// Output: 2
	// Explanation: There are two ways to climb to the top.
	// 1. 1 step + 1 step
	// 2. 2 steps
	//
	// Example 2:
	// Input: 3
	// Output: 3
	// Explanation: There are three ways to climb to the top.
	// 1. 1 step + 1 step + 1 step
	// 2. 1 step + 2 steps
	// 3. 2 steps + 1 step

	// Constraints:
	// 1 <= n <= 45

	public static void main(String[] args) {
		ClimbingStairs test = new ClimbingStairs();
		System.out.println("Input: 5");
		System.out.println("Output: " + test.climbStairs(5));
	}

	public int climbStairs(int n) {
		int a[] = new int[n + 1];
		a[0] = 0;
		a[1] = 1;
		if (n >= 2)
			a[2] = 2;
		for (int i = 3; i <= n; i++)
			a[i] = a[i - 1] + a[i - 2];
		return a[n];
	}

}
