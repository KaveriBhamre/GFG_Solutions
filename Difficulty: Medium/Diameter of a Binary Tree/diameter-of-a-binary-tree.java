/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int ans = 0;

        private int height(Node root) {
            if(root == null) return 0;

            int lh = height(root.left);
            int rh = height(root.right);

            ans = Math.max(ans, lh + rh);

            return 1 + Math.max(lh, rh);
        }

    public int diameter(Node root) {
        height(root);
        return ans;
        
    }
}