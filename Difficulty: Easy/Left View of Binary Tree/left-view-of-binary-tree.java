/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()) {
            int level = q.size();
            for(int i = 0; i < level; i++) {
                Node curr = q.poll();
                
                if(i == 0) list.add(curr.data);
                
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }
        
        return list;
    }
}