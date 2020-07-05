package com.chandran.july2020;

/*
 * Java Program to traverse a binary tree
 * using in order traversal without recursion.
 * In InOrder traversal first left node is visited, followed by root
 * and right node.
 *
 * input:
 *      40
 *     /\
 *    20   50
 *   / \\
 *  10  30   60
 * /   /\
 * 5  67  78
 *
 * output: 5 10 20 30 40 50 60 67 78
 */
public class BinaryTreenTraverse {
	public static void main(String[] args) throws Exception {
		// construct the binary tree given in question
		BinaryTree bt = BinaryTree.create();
		// traversing binary tree using InOrder traversal using recursion
		System.out.println("printing nodes of binary tree on InOrder using recursion");
		bt.inOrder();
	}
}

class BinaryTree {
	static class TreeNode {
		String data;
		TreeNode left, right;

		TreeNode(String value) {
			this.data = value;
			left = right = null;
		}
	}

	// root of binary tree
	TreeNode root;

	/**
	 * traverse the binary tree on InOrder traversal algorithm
	 */
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.printf("%s ", node.data);
		inOrder(node.right);
	}

	/**
	 * Java method to create binary tree with test data
	 *
	 * @return a sample binary tree for testing
	 */
	public static BinaryTree create() {
		BinaryTree tree = new BinaryTree();
		TreeNode root = new TreeNode("240");
		tree.root = root;
		tree.root.left = new TreeNode("320");
		tree.root.left.left = new TreeNode("110");
		tree.root.left.left.left = new TreeNode("150");
		tree.root.left.right = new TreeNode("305");
		tree.root.right = new TreeNode("500");
		tree.root.right.right = new TreeNode("600");
		tree.root.left.right.left = new TreeNode("670");
		tree.root.left.right.right = new TreeNode("780");
		return tree;
	}
}
