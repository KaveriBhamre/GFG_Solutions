/* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {
    int maxi = Integer.MIN_VALUE;

        private int height(Node root) {
            if(root == null) return 0;

            int lh = Math.max(0, height(root.left));
            int rh = Math.max(0, height(root.right));

            maxi = Math.max(maxi, (lh + rh + root.data));

            return root.data + Math.max(lh, rh);
        }
        
    int findMaxSum(Node root) {
        height(root);
        return maxi;
        
    }
}