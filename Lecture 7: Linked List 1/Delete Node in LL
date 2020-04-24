// Delete Node in LL
// Send Feedback
// Given a linked list and a position i, delete the node of ith position from Linked List iteratively.
// If position i is greater than length of LL, then you should return the same LL without any change.
// Indexing starts from 0. You don't need to print the elements, just delete the node and return the head of updated LL.
// Input format :
// Line 1 : Linked list elements (separated by space and terminated by -1)
// Line 2 : Integer i (position)
// Output format :
// Updated LL elements (separated by space)
// Sample Input 1 :
// 3 4 5 2 6 1 9 -1
// 3
// Sample Output 1 :
// 3 4 5 6 1 9
// Sample Input 2 :
// 3 4 5 2 6 1 9 -1
// 0
// Sample Output 2 :
// 4 5 2 6 1 9

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/LinkedListNode<Integer> temp=head;
        int counter=0;
        while(head!=null)
        {head=head.next;
        counter++;}
        
        head=temp;
        
        //if element present at Zeroth index
        
        if(i==0){
            head=head.next;
        //return head;
        }
        
        //if element is present inbetween
        if(i<counter)
        { 
           while(i>1){
               head=head.next;
            	i--;
           }
            
            head.next=head.next.next;
            head=temp;
            //return head;
            
        }
         //if element is present at last
        if(i==counter){
            while(i>1){
               head=head.next;
            	i--;
           }
            head.next=null;
             head=temp;
        }
		
        return head;
        
	}
}
