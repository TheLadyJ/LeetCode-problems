package main;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
//	Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//	In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//	Example:
//
//	Input: 5
//	Output:
//	[
//	     [1],
//	    [1,1],
//	   [1,2,1],
//	  [1,3,3,1],
//	 [1,4,6,4,1]
//	]
	
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i =0;i<numRows;i++) {
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
        return list;
    }

}
