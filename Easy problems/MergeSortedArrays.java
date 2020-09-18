package main;

public class MergeSortedArrays {

	// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
	// one sorted array.
	//
	// Note:
	//
	// The number of elements initialized in nums1 and nums2 are m and n
	// respectively.
	// You may assume that nums1 has enough space (size that is equal to m + n) to
	// hold additional elements from nums2.
	//
	// Example:
	// Input:
	// nums1 = [1,2,3,0,0,0], m = 3
	// nums2 = [2,5,6], n = 3
	//
	// Output: [1,2,2,3,5,6]
	//
	// Constraints:
	// -10^9 <= nums1[i], nums2[i] <= 10^9
	// nums1.length == m + n
	// nums2.length == n

	public static void main(String[] args) {
		MergeSortedArrays test = new MergeSortedArrays();
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };

		System.out.println("Input:\r\n" + "nums1 = [1,2,3,0,0,0], m = 3\r\n" + "nums2 = [2,5,6], n = 3\n");

		test.merge(nums1, 3, nums2, 3);
		System.out.print("Output: ");
		test.printArray(nums1);

	}

	public void printArray(int[] arr) {
		System.out.print("[");
		if (arr.length != 0)
			System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			System.out.print("," + arr[i]);
		}
		System.out.print("]");
		System.out.println();
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0)
			return;
		if (m == 0) {
			copy(nums1, nums2, 0, nums1.length - 1);
			return;
		}

		for (int t = nums1.length - 1, j = n - 1, i = m - 1;; t--) {
			if (i < 0) {
				while (t >= 0) {
					nums1[t] = nums2[j--];
					t--;
				}
				return;
			}

			if (j < 0) {
				while (t >= 0) {
					nums1[t] = nums1[i--];
					t--;
				}
				return;
			}

			if (nums1[i] > nums2[j])
				nums1[t] = nums1[i--];

			else
				nums1[t] = nums2[j--];

		}

	}

	private void copy(int[] nums1, int[] nums2, int from, int end) {

		for (int index = from; index <= end; index++)
			nums1[index] = nums2[index];
	}

}
