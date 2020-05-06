// Replace node with depth
// Send Feedback
// In a given Generic Tree, replace each node with its depth value. You need to just update the data of each node, no need to return or print anything.
// Input format :

// Line 1 : Elements in level order form separated by space (as per done in class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 : (Level wise, each level in new line)
// 0 
// 1 1 1 
// 2 2         
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
    
    static int a=0;
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){


        
        
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
        //added 1st level here 
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty())
        {    
            TreeNode<Integer> frontNode = queue.remove();
            
            if(frontNode == null)
            {
                if(queue.isEmpty())
                {
                    break;
                }
               
                a++;
                queue.add(null);
            }
            else
            {
                frontNode.data=a;
                for(int i=0;i<frontNode.children.size();i++)
                {
                    queue.add(frontNode.children.get(i));
                }
                
                
            }
            
        }
        
	
	}
	
	
}
