static int maximum(Node root){
		if(root==null) return Integer.MIN_VALUE;

		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
	}

//maximum value of node
//call this function in main function
//first make binary tree
