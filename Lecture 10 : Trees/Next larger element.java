// Next larger element
// Send Feedback
// Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
// Return NULL if no node is present with value greater than n.
// Input format :

// Line 1 : Integer n

// Line 2 : Elements in level order form separated by space (as per done in class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Output format : Node with value just greater than n.

// Sample Input 1 :
// 18
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 20
// Sample Input 2 :
// 21
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 2:
// 30

import java.util.Queue;
import java.util.LinkedList;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
 static TreeNode<Integer> res =null; 
  static void nextLargerElementUtil(TreeNode<Integer> root, int x) 
 { 
    if (root == null) 
    {
        return;
    }
  
    // if root is less than res but  
    // greater than x, update res 
    if (root.data > x)  
    {
        if (res==null || root.data<res.data)
        {
            res = root; 
        }
    }
  
    // Number of children of root 
    int numChildren = root.children.size(); 
  
    // Recur calling for every child 
    for (int i = 0; i < numChildren; i++) 
    {
        nextLargerElementUtil(root.children.get(i),x); 
    }
  
   
 } 
    
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// resultant node 
    //TreeNode<Integer> res = new TreeNode<>(Integer.MIN_VALUE); 
    // calling helper function 
    nextLargerElementUtil(root,n); 
        //System.out.println(res);
       
    return res; 
      


	}
	
}
