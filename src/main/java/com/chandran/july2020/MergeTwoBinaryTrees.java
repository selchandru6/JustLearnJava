package com.chandran.july2020;

/*
 * Date : 2nd July 2020.
 *  This class provides to add two binary Trees into one.
 * 
 */

public class MergeTwoBinaryTrees {

	int data;
	MergeTwoBinaryTrees left, right;

	public MergeTwoBinaryTrees(int data, MergeTwoBinaryTrees left, MergeTwoBinaryTrees right) { 
        this.data = data; 
        this.left = left; 
        this.right = right; 
    }

	/*
	 * Helper method that allocates a new MergeTwoBinaryTrees with the given data and NULL left and
	 * right pointers.
	 */
	static MergeTwoBinaryTrees newMergeTwoBinaryTrees(int data) {
		return new MergeTwoBinaryTrees(data, null, null);
	}

	/* Given a binary tree, print its MergeTwoBinaryTreess in inorder */
	static void inorder(MergeTwoBinaryTrees MergeTwoBinaryTrees) {
		if (MergeTwoBinaryTrees == null)
			return;

		/* first recur on left child */
		inorder(MergeTwoBinaryTrees.left);

		/* then print the data of MergeTwoBinaryTrees */
		System.out.printf("%d ", MergeTwoBinaryTrees.data);

		/* now recur on right child */
		inorder(MergeTwoBinaryTrees.right);
	}

	/* Method to merge given two binary trees */
	static MergeTwoBinaryTrees MergeTrees(MergeTwoBinaryTrees t1, MergeTwoBinaryTrees t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		t1.data += t2.data;
		t1.left = MergeTrees(t1.left, t2.left);
		t1.right = MergeTrees(t1.right, t2.right);
		return t1;
	}

	// Driver method
	public static void main(String[] args) {
		/*
		 * Let us construct the first Binary Tree 1 / \ 2 3 / \ \ 4 5 6
		 */

		MergeTwoBinaryTrees root1 = newMergeTwoBinaryTrees(1);
		root1.left = newMergeTwoBinaryTrees(2);
		root1.right = newMergeTwoBinaryTrees(3);
		root1.left.left = newMergeTwoBinaryTrees(4);
		root1.left.right = newMergeTwoBinaryTrees(5);
		root1.right.right = newMergeTwoBinaryTrees(6);

		/*
		 * Let us construct the second Binary Tree 4 / \ 1 7 / / \ 3 2 6
		 */
		MergeTwoBinaryTrees root2 = newMergeTwoBinaryTrees(4);
		root2.left = newMergeTwoBinaryTrees(1);
		root2.right = newMergeTwoBinaryTrees(7);
		root2.left.left = newMergeTwoBinaryTrees(3);
		root2.right.left = newMergeTwoBinaryTrees(2);
		root2.right.right = newMergeTwoBinaryTrees(6);

		MergeTwoBinaryTrees root3 = MergeTrees(root1, root2);
		System.out.printf("The Merged Binary Tree is:\n");
		inorder(root3);
	}

}
