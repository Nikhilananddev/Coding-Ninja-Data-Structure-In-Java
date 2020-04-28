// Bubble Sort (Iterative) LinkedList
// Send Feedback
// Sort a given linked list using Bubble Sort (iteratively). While sorting, you need to swap just the data.
// You don't need to print the elements, just sort the elements and return the head of updated LL.
// Input format : Linked list elements (separated by space and terminated by -1)`

// Sample Input 1 :
// 1 4 5 2 -1
// Sample Output 1 :
// 1 2 4 5


public class Solution {



	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
        
        
      LinkedListNode<Integer> current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return head;  
        }  
        else 
        {  
            while(current != null) 
            {  
                //Node index will point to node next to current  
                index = current.next;  
                  
               	 while(index != null) 
                 {  
                    //If current node's data is greater than index's node data, swap the data between them  
                    if(current.data > index.data)
                    {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
               	 }  
               	 current = current.next;  
            }  
            
        }  return head;
        
	}



}
