package main;

public class PalindromeNumber {
	
	//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

	/*Example 1:
		Input: 121
		Output: true
	
	Example 2:
		Input: -121
		Output: false
	Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
	
	Example 3:
		Input: 10
		Output: false
	Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/
	
	/*Follow up:
	Coud you solve it without converting the integer to a string?*/
	
	public static void main(String[] args) {
		PalindromeNumber test = new PalindromeNumber();
		
		System.out.println(test.isPalindromeFirstWay(12321));
		System.out.println(test.isPalindromeSecondWay(1202021));
	}
	
	
	
	public boolean isPalindromeFirstWay(int x) {
		String num= new StringBuilder().append(x).toString();
		String reverse= new StringBuilder().append(x).reverse().toString();
	    
		return num.equals(reverse);
	}
	
	public boolean isPalindromeSecondWay(int x) {
	        if(x<0)
	        	return false;
	        
	        long reverse=0;
	        int num=x;
	        
	        while(x!=0) {
	        	reverse*=10;
	        	reverse+=x%10;
	        	x/=10;
	        }
	        
	        return num==reverse;
	    
	}

}


