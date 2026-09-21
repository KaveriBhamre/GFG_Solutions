/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    static boolean isLeaf(Node root) {
        if(root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
    
    public void leftBoundary(Node root, ArrayList<Integer> res) {
        if(root == null || isLeaf(root)) return;
        
        res.add(root.data);
        
        if(root.left != null) {
            leftBoundary(root.left, res);
        }
        else if(root.right != null) {
            leftBoundary(root.right, res);
        }
    }
    
    public void leafNodeBoundary(Node root, ArrayList<Integer> res) {
        if(root == null) return;
        if(isLeaf(root)) {
            res.add(root.data);
        }
        leafNodeBoundary(root.left, res);
        leafNodeBoundary(root.right, res);
    }
    
    public void rightBoundary(Node root, ArrayList<Integer> res) {
        if(root == null || isLeaf(root)) return;
        
        if(root.right != null) {
            rightBoundary(root.right, res);
        }
        else if(root.left != null){
            rightBoundary(root.left, res);
        }
        
        res.add(root.data);
    }
    
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) return res;
        
        if(!isLeaf(root)) res.add(root.data);
        
        leftBoundary(root.left, res);
        leafNodeBoundary(root, res);
        rightBoundary(root.right, res);
        
        return res;
        
        
        
    }
}