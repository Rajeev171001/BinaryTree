static int size(Node root){
		if(root==null) return 0;
		
		return size(root.left)+size(root.right)+1;
	}

// call this function in main function
//first make binary tree by tree method
