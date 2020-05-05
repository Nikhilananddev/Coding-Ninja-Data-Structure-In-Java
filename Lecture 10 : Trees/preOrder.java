	public static void preOrder(TreeNode<Integer> root){
          
          if(root==null)
          return;
        
         System.out.print(root.data+" ");
        for(TreeNode<Integer> child:root.children)
        {
            preOrder(child);
        }
        
        
       
  
        
	}
