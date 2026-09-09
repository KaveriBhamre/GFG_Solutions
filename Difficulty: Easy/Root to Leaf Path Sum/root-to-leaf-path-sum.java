/* A Binary Tree node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
	boolean hasPathSum(Node root, int targetSum) {
		// code here
		if(root == null) return false;

          if(root.left == null && root.right == null) {
              return targetSum == root.data;
          }

          return hasPathSum(root.left, targetSum - root.data) ||
                 hasPathSum(root.right, targetSum - root.data);


	}
}
