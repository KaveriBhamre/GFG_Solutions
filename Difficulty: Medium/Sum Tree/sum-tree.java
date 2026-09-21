/* Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int solve (Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        
        int leftSum = solve(root.left);
        int rightSum = solve(root.right);
        
        if(leftSum == -1 || rightSum == -1) {
               return -1;
           }
        
        if(leftSum + rightSum != root.data) {
            return -1;
        }
        
        return leftSum + rightSum + root.data;
    }
    
    public boolean isSumTree(Node node) {
        return solve(node) != -1;
        
    }
}