/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        st.push(root);
        
        while( !st.isEmpty()) {
            Node temp = st.pop();
            if(temp.right != null) {
                st.push(temp.right);
            }
            if(temp.left != null) {
                st.push(temp.left);
            }
            list.add(temp.data);
        }
        
        return list;
    }
}