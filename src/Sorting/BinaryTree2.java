package Sorting;

class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item = key;
		left = right = null;
	}
	
}

public class BinaryTree2 {
	Node root;
	BinaryTree2(){
		root = null;
		
	}
	
	void inorder(Node node) {
		if(node == null)
			return;
		// Traverse left
		inorder(node.left);
		// Traverse root
		System.out.print(node.item +"->");
		// Traverse right
		inorder(node.right);
	}
	void preorder(Node node) {
		if(node == null)
			return;
		// Traverse root
		System.out.print(node.item +"->");
		// Traverse left
				preorder(node.left);
		// Traverse right
		preorder(node.right);
	}
	void postorder(Node node) {
		if(node == null)
			return;
		// Traverse left
		postorder(node.left);
		// Traverse right
		postorder(node.right);
		//Traverse root
		System.out.print(node.item+"->");
	}


	public static void main(String[] args) {
		BinaryTree2 tree = new BinaryTree2();
		tree.root = new  Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(10);
		tree.root.right.left = new Node(8);
		tree.root.right.right = new Node(9);
		tree.root.left.left.left = new Node(2);
		tree.root.left.left.right = new Node(3);
		System.out.println("Inorder traversal: ");
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Preorder traversal: ");
		tree.preorder(tree.root);
		System.out.println();
		System.out.println("Postorder traversal");
		tree.postorder(tree.root);
		
		
	}

}
