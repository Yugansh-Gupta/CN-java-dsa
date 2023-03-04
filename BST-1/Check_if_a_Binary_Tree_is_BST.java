/*
\Check if a Binary Tree is BST
Send Feedback
Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
Note: Duplicate elements should be kept in the right subtree.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format :
The first and only line of output contains either true or false.
Constraints :
Time Limit: 1 second
Sample Input 1 :
3 1 5 -1 2 -1 -1 -1 -1
Sample Output 1 :
true
Sample Input 2 :
5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
Sample Output 2 :
false
*/
import java.util.ArrayList;

/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

public class Solution {
	// static int max;
	// public static void inorder(BinaryTreeNode<Integer> root){
	// if(root.left!=null){
	// inorder(root.left);
	// }
	// else{
	// max=root.data;
	// }
	// }
	// public static boolean isBST1(BinaryTreeNode<Integer> root){
	// if (root != null) {
	// isBST1(root.left);
	// if (root.data > max) {
	// return false;
	// } else {
	// max = root.data;
	// }
	// isBST1(root.right);

	// }
	// return true;
	// }
	static int maxval(BinaryTreeNode<Integer> root){
		if(root!=null && root.right!=null){
			return maxval(root.right);
		}
		return root.data;
	}

	static int minval(BinaryTreeNode<Integer> root){
		if(root!=null && root.left!=null){
			return minval(root.left);
		}
		return root.data;
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/*
		 * Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if (root != null) {
			if (isBST(root.left) && isBST(root.right)) {
				if (root.left == null) {
					if (root.right == null) {
						return true;
					} else {
						if (minval(root.right) >= root.data) {
							return true;
						} else {
							return false;
						}
					}
				} else {
					if (root.right == null) {
						if (maxval(root.left) < root.data) {
							return true;
						} else {
							return false;
						}
					} else {
						if (maxval(root.left) < root.data && root.data <= minval(root.right)) {
							return true;
						} else {
							return false;
						}
					}
				}
			} else {
				return false;
			}
		}
		return true;

	}

}