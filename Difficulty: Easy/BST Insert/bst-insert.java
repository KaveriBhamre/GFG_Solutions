/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public Node insert(Node root, int val) {
        // code here
        Node node = new Node(val);

        if(root == null) {
            root = node;
            return root;
        }

        Node curr = root;
        while(true) {
            if(val <= curr.data) {
                //left
                if(curr.left == null) {
                    curr.left = new Node(val);
                    break;
                }
                curr = curr.left;
            }
            else {
                //right
                if(curr.right == null) {
                    curr.right = new Node(val);
                    break;
                }
                curr = curr.right;
            }
        }

        return root;
    }
}
