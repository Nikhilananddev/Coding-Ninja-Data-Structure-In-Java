// Remove Duplicates Recursively
// Send Feedback
// Given a string S, remove consecutive duplicates from it recursively.
// Input Format :
// String S
// Output Format :
// Output string
// Constraints :
// 1 <= Length of String S <= 10^3
// Sample Input :
// aabccba
// Sample Output :
// abcba

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		
       
 public static String removeConsecutiveDuplicates(String s) {
  // Write your code here
        if(s.length()==1){
            return s;
        }
        
        String ans="";
        if(s.charAt(0) != s.charAt(1)){
            ans=ans+s.charAt(0);
        }
        
        String str1=removeConsecutiveDuplicates(s.substring(1)); 
        return ans+str1;

}
