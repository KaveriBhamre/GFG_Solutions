/* Structure of Binary Tree Node 
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public void kDist(Node root, int k, ArrayList<Integer> list) {
        if(root == null) return;
        if(k == 0){
            list.add(root.data);
            return;
        }
        kDist(root.left, k-1, list);
        kDist(root.right, k-1, list);
    }
    
    public ArrayList<Integer> kdistance(Node root, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        kDist(root, k, list);
        return list;
        
    }
};