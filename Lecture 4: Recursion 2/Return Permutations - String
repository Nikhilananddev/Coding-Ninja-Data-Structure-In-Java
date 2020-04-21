// Return Permutations - String
// Send Feedback
// Given a string S, find and return all the possible permutations of the input string.
// Note 1 : The order of permutations is not important.
// Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
// Input Format :
// String S
// Output Format :
// All permutations (in different lines)
// Sample Input :
// abc
// Sample Output :
// abc
// acb
// bac
// bca
// cab
// cba

public class solution {
	
	public static String[] permutationOfString(String input){
		if(input.length()==2){
		String a=input.substring(0,1)+input.substring(1);
		String b=input.substring(1)+input.substring(0,1);
		String[] arr=new String[]{a,b};
		return arr;
		}
        
        int f=1,c=0;
        for(int i=1; i<=input.length(); i++)
            f*=i;
        
        String[] ans=new String[f];
        for(int i=0; i<input.length(); i++){
            String[] arr=permutationOfString(input.substring(0,i)+input.substring(i+1));
            for(int j=0; j<arr.length; j++){
            	ans[c++]=input.charAt(i)+arr[j];
            }
    	}
        
        return ans;
	}
    
    
	
}
