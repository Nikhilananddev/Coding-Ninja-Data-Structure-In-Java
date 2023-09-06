// Node having sum of children and node is max
// Send Feedback
// Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
// Input format :

// Line 1 : Elements in level order form separated by space (as per done in class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Output format : Node with maximum sum.

// Sample Input 1 :
// 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
// Sample Output 1 :
// 1



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
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		if(root == null)
		return null;
		TreeNode<Integer> temp=null;
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		int s=0;
		while(!q.isEmpty()){
			int size=q.size();
			for(int i=0;i<size;i++){
				TreeNode<Integer>temp1=q.poll();
				int s1=temp1.data;
				for(int j=0;j<temp1.children.size();j++){
					s1=s1+temp1.children.get(j).data;
					q.add(temp1.children.get(j));
				}
				if(s1>s){
					s=s1;
					temp=temp1;
				}
			}
		}
		return temp;
	}
	
		
}
