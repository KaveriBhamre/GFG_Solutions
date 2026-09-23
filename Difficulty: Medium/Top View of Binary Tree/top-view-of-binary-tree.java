/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
} */

class Solution {
    
    class Pair {
        Node node;
        int col;

        Pair(Node node, int col) {
            this.node = node;
            this.col = col;
        }
    }
    
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        if(root == null) return list;
        
        q.offer(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair it = q.poll();
            int c = it.col;
            Node n = it.node;
            
            if(!map.containsKey(c)) {
                map.put(c, n.data);
            }
            
            if(n.left != null) {
                q.offer(new Pair(n.left, c-1));
            }
            if(n.right != null) {
                q.offer(new Pair(n.right, c+1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        return list;
        
    }
}