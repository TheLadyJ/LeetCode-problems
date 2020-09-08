package easy;

public class LengthOfLastWord {

//	Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
//	return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
//	If the last word does not exist, return 0.
//	
//	Note: A word is defined as a maximal substring consisting of non-space characters only.

//	Example:
//		Input: "Hello World"
//		Output: 5

	public static void main(String[] args) {
		LengthOfLastWord test = new LengthOfLastWord();
		System.out.println("Input: \"Hello World\"");
		System.out.println("Output: " + test.lengthOfLastWord("Hello World"));
	}

	public int lengthOfLastWord(String s) {
		 String[] word = s.split(" ");
	        return word.length == 0 ? 0:word[word.length - 1].length();
	}

}
