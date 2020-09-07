package easy;

public class ImplementStr {
	
//	Implement strStr().
//
//	Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//	Example 1:
//		Input: haystack = "hello", needle = "ll"
//		Output: 2
//	
//	Example 2:
//		Input: haystack = "aaaaa", needle = "bba"
//		Output: -1
	
//	Clarification:
//	What should we return when needle is an empty string? This is a great question to ask during an interview.
//	For the purpose of this problem, we will return 0 when needle is an empty string. 
//	This is consistent to C's strstr() and Java's indexOf().

//	Constraints:
//	haystack and needle consist only of lowercase English characters.

	public static void main(String[] args) {
		ImplementStr test = new ImplementStr();
		System.out.println("Input: haystack = \"hello\", needle = \"ll\"");
		System.out.println("Output: "+test.strStr("hello", "ll"));
		System.out.println();
		System.out.println("Input: haystack = \"aaaaa\", needle = \"bba\"");
		System.out.println("Output: "+test.strStr("aaaaa", "bba"));
	}
	
	public int strStr(String haystack, String needle) {
        if(needle.length()==0)
        	return 0;
        return haystack.indexOf(needle);
    }

}
