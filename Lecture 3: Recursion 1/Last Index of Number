// Last Index of Number
// Send Feedback
// Given an array of length N and an integer x, 
// you need to find and return the last index of integer x present in the array.
//     Return -1 if it is not present in the array.
// Last index means - if x is present multiple times in the array, 
// return the index at which x comes last in the array.
// You should start traversing your array from 0, not from (N - 1).
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// last index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 3



public class Solution {

    
     
    public static int Index1(int input[],int x,int index)
    {
        if(input[index]==x)
        return index;
        
      if(input[index]!=x && index==0)
        return -1;
        
        index=Index1(input,x,index-1);
        
        return index;
        
        
    }
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		  
       int index=Index1(input,x,input.length-1);
           return index;
    
    
    }
	
}
