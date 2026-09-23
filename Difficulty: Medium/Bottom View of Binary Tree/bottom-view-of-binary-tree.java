/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    class Pair {
        Node node;
        int col;

        Pair(Node node, int col) {
            this.node = node;
            this.col = col;
        }
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        if(root == null) return list;
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int col = p.col;
            Node node = p.node;
            
            map.put(col, node.data);
            
            if(node.left != null) {
                q.add(new Pair(node.left, col-1));
            }
            if(node.right != null) {
                q.add(new Pair(node.right, col + 1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        return list;
        
    }
}