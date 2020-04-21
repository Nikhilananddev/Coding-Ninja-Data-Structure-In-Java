// Print Subset Sum to K
// Send Feedback
// Given an array A and an integer K, print all subsets of A which sum to K.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
// Note : The order of subsets are not important. Just print them in different lines.
// Input format :
// Line 1 : Size of input array
// Line 2 : Array elements separated by space
// Line 3 : K 
// Sample Input:
// 9 
// 5 12 3 17 1 18 15 3 17 
// 6
// Sample Output:
// 3 3
// 5 1

public class solution {
    public static void printSubsetsSumTok(int input[],int start, int k, int[] output){
        
         if(start==input.length){
            
             if(k==0)
             {
            for(int i=0; i < output.length; i++)
            {
              System.out.print(output[i]+" ");
           }
            System.out.println();
            return;
             }
             else
             {
                 return;
             }
        }
        
         printSubsetsSumTok(input, start+1,k, output);
        int[] newOutput=new int[output.length+1];
        
        for(int i=0; i < output.length; i++){
           newOutput[i]=output[i];
        }
        
    
        newOutput[newOutput.length - 1]=input[start];
        printSubsetsSumTok(input,start+1,k-input[start],newOutput);
         
        
        
    }
    
    
    
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        int[] output = new int[0];
		printSubsetsSumTok(input,0, k, output);
	}
}
