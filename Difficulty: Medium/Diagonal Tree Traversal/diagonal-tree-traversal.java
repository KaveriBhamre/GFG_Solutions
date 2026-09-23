/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}*/
class Solution {
    public ArrayList<Integer> diagonal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            Node curr = q.poll();
            while( curr != null) {
                list.add(curr.data);
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                curr = curr.right;
            }
        }
        return list;
    }
}