package main;

import java.util.Scanner;

public class ReverseInteger {

	// Given a 32-bit signed integer, reverse digits of an integer.

	/*
	 * Example 1:
	 * 
	 * Input: 123 Output: 321
	 * 
	 * Example 2: Input: -123 Output: -321
	 * 
	 * Example 3: Input: 120 Output: 21
	 */

	/*
	 * Note: Assume we are dealing with an environment which could only store
	 * integers within the 32-bit signed integer range: [−231, 231 − 1]. For the
	 * purpose of this problem, assume that your function returns 0 when the
	 * reversed integer overflows.
	 */

	public static void main(String[] args) {
		ReverseInteger test = new ReverseInteger();

		System.out.println("Input: 1234567892");
		System.out.println("Output: " + test.reverse(1234567892));
	}

	
	public int reverse(int x)  throws NumberFormatException{
	       boolean isNegative = x<0;
	        if(isNegative)
	            x=x*-1;
	        
	        
	        long newNumber = 0;
	        
	        while(x>0){
	            int lastDigitOfX = x%10;
	            newNumber = (newNumber*10) + lastDigitOfX;
	            x = x/10;
	        }
	        
	        if(newNumber > Integer.MAX_VALUE)
	            return 0;
	        
	        
	        if(isNegative)
	            newNumber = newNumber*-1;
	        
	        
	        return (int)newNumber;
	        
	    }
	
	
}
