package easy;
import java.util.*;


public class PascalsTriangle2 {

//	Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.
//	Notice that the row index starts from 0.
//
//	In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//	Follow up:
//	Could you optimize your algorithm to use only O(k) extra space?
	
//	Example 1:
//		Input: rowIndex = 3
//		Dutput: [1,3,3,1]
//				
//	Example 2:
//		Input: rowIndex = 0
//		Output: [1]
//	
//	Example 3:
//		Input: rowIndex = 1
//		Output: [1,1]


	
	 public List<Integer> getRow(int rowIndex) {
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
	        for(int i =0;i<=rowIndex;i++) {
	        	//For each row we will create a new list
	        	List<Integer> innerList = new ArrayList<>();
	        	for(int j =0;j<i+1;j++) {
	        		//Every first and last element of that list will be equal to 1
	        		if(j==0||j==i) 
	        			innerList.add(1);
	        		//For inner elements we will have to calculate the sum of particular elements of the previous row
	        		else if(i>0) {
	        			int add=list.get(i-1).get(j-1)+list.get(i-1).get(j); //get(j-1) and get(j) are those particular elements and get(i-1) is the previous row
	        		    innerList.add(add);
	        		}
	        	}
	        	//When we are finished creating one row, we are putting that row (innerList) in the list
	        	list.add(innerList);
	        }
	      //Now we only need return the last row
	       return list.get(rowIndex);
	      
	 }

}
