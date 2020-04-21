// Return subsets sum to K
// Send Feedback
// Given an array A of size n and an integer K, return all subsets of A which sum to K.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
// Note : The order of subsets are not important.
// Input format :
// Line 1 : Integer n, Size of input array
// Line 2 : Array elements separated by space
// Line 3 : K 
// Constraints :
// 1 <= n <= 20
// Sample Input :
// 9 
// 5 12 3 17 1 18 15 3 17 
// 6
// Sample Output :
// 3 3
// 5 1

public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	
    public static int[][] subsetsSumK(int input[], int k,int start) {
		// Write your code here
        if(start==input.length)
        {
            if(k==0){int arr[][]=new int[1][0];return arr; }
            else{int arr[][]=new int[0][0];return arr;}
        }
        int temp[][]=subsetsSumK(input,k,start+1);
        int temp1[][]=subsetsSumK(input,k-input[start],start+1);
        int ans[][]=new int[temp.length+temp1.length][];
        for(int i=0;i<temp.length;i++)
        {
           ans[i]=new int[temp[i].length];
            for(int j=0;j<ans[i].length;j++)
            {
                ans[i][j]=temp[i][j];
            }
        }
         for(int i=0;i<temp1.length;i++)
        {
             ans[i+temp.length]=new int[temp1[i].length+1];
              ans[i+temp.length][0]=input[start];
            for(int j=1;j<ans[i+temp.length].length;j++)
            {
                ans[i+temp.length][j]=temp1[i][j-1];
            }
        }
        return ans;
        
        

	}
    public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
         return subsetsSumK(input,k,0);
    }
}
