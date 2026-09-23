/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    public int sumOfLongRootToLeafPath(Node root) {
        if(root == null) return 0;
        Queue<Object[]> q = new LinkedList<>();
        int maxLen = 0, maxSum = 0;
        q.offer(new Object[]{root, root.data, 1});
        
        while(!q.isEmpty()) {
            Object[] front = q.poll();
            Node node = (Node)front[0];
            int sum = (int)front[1];
            int len = (int)front[2];
            
            if(node.left == null && node.right == null) {
                if(len > maxLen) {
                    maxLen = len;
                    maxSum = sum;
                }else if(len == maxLen && sum > maxSum) {
                    maxSum = sum;
                }
            }
            
            
            if(node.left != null) {
                q.offer(new Object[]{node.left, node.left.data + sum, len + 1});
            }
            if(node.right != null) {
                q.offer(new Object[]{node.right, node.right.data + sum, len + 1});
            }
            
        }
        
        return maxSum;
    }
}