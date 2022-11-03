static int height(Node root){
		if(root==null) return 0;

		return Math.max(height(root.left),height(root.right))+1;
	}

//call this function in mani class
//first make binary tree using Tree code
