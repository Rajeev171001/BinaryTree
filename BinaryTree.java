package tree;

import java.util.Scanner;

public class Tree{
	static Scanner sc=null;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		Node root=CreateTree();
		// inOrder(root);
		// System.out.println();

		preOrder(root);
		System.out.println();

		// postOrder(root);
			// System.out.println();
		
	}

	static Node CreateTree(){
		Node root=null;
		System.out.println("Enter the data");
		int data=sc.nextInt();

		if(data==-1) return null;
		root=new Node(data);

		System.out.println("Enter left for"+ data);
		root.left=CreateTree();

		System.out.println("Enter right for"+data);
		root.right=CreateTree();

		return root;

	}

	static void inOrder(Node root){
		if(root==null) return;
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}

	static void preOrder(Node root){
		if(root==null) return;
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root){
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data+" ");
	}
}

class Node{
	Node left,right;
	int data;

	public Node(int data){
		this.data=data;
	}
}
