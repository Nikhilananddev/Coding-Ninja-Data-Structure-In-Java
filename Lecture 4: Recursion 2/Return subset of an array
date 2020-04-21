// Return subset of an array
// Send Feedback
// Given an integer array (of length n), find and return all the subsets of input array.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
// Note : The order of subsets are not important.
// Input format :

// Line 1 : Size of array

// Line 2 : Array elements (separated by space)

// Sample Input:
// 3
// 15 20 12
// Sample Output:
// [] (this just represents an empty array, don't worry about the square brackets)
// 12 
// 20 
// 20 12 
// 15 
// 15 12 
// 15 20 
// 15 20 12 

public class solution {
    
    
    public static int[][] subsets(int input[], int start){
        
       
		if(start == input.length - 1) {
			int output[][] = new int[1][1];
			output[0][0] = input[start];
			return output;
		}
       	
        int smallAns[][] = subsets(input, start + 1);
		int ans[][] = new int[2 * smallAns.length + 1][];
        for(int i = 0 ; i < smallAns.length ; i++) {
			ans[i] = new int[smallAns[i].length];
			
		}
		
		ans[smallAns.length] = new int[1];
		int  y = 0;
		for(int i = smallAns.length + 1 ; i < ans.length ; i++)
			ans[i] = new int[smallAns[y++].length + 1];

		
		for(int i = 0 ; i < smallAns.length; i++) {
			for(int j = 0 ; j < smallAns[i].length;j++) {
				ans[i][j] = smallAns[i][j];
			}
		}
		int x = smallAns.length;
		ans[x++][0] = input[start];
		for(int i = 0 ; i < smallAns.length ; i++) {
			ans[x][0] = input[start];
			for(int j = 0 ; j < smallAns[i].length ; j++) {
				ans[x][j + 1] = smallAns[i][j];
			}
			x++;
		}
		return ans;
	
    }

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
        
        return subsets(input, 0);

	}
}
