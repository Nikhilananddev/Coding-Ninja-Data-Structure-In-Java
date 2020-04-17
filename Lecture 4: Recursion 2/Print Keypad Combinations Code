// Print Keypad Combinations Code
// Send Feedback
// Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
// Note : The order of strings are not important. Just print different strings in new lines.
// Input Format :
// Integer n
// Output Format :
// All possible strings in different lines
// Constraints :
// 1 <= n <= 10^6
// Sample Input:
// 23
// Sample Output:
// ad
// ae
// af
// bd
// be
// bf
// cd
// ce
// cf


public class solution {

	
   public static String dial(int n)
    {
     switch(n)
     {
        case 2:	return "abc";
         		
        case 3:	return "def";
         		
        case 4:	return "ghi";
         	
        case 5:	return "jkl";
         	
        case 6:	return "mno";
         	
        case 7:	return "pqrs";
         	
        case 8:	return "tuv";
			
        case 9:	return "wxyz";
        
       default:break;
     }
     return ""; 
    }
  

    
  	
  	
      public static   void pK(int num,String out)
      {
    
   		 if(num==0)
         {
     	  System.out.println(out);
   	    	 return;
    	}
          
    String pd=dial(num%10);
    for(int i=0;i<pd.length();i++)
    {
        pK(num/10,pd.charAt(i)+out);
    }
}
   
    
    
    
    
    public static void printKeypad(int input){
		// Write your code here	// Write your code here
         pK(input,"");
		
	}
    
    

 
    
}
