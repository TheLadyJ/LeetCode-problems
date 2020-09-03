package main;

import java.util.*;

public class TwoSum {
	
	/*Given an array of integers nums and and integer target, return the indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	You can return the answer in any order.*/
	
	/*Example 1:
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Output: Because nums[0] + nums[1] == 9, we return [0, 1]
	
	Example 2:
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		
	Example 3:
		Input: nums = [3,3], target = 6
		Output: [0,1]*/
	
	public static void main(String[] args) {
		TwoSum test = new TwoSum();
		
		int[] nums = {2,7,11,15};
		int target=9;
		
		int[] result= test.twoSum(nums, target);
		
		System.out.println("Output: ["+result[0]+","+result[1]+"]");

	}
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i =0;i<nums.length;i++) {
        	if(map.containsKey(target-nums[i])) {
        		return new int[] {map.get(target-nums[i]), i};
        	}
        	map.put(nums[i], i);
        }
		
        return null;
    }

}
