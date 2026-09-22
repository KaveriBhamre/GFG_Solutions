/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    //{col -> {level -> list}}
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();

        private void dfs(Node root, int col, int level) {
            if(root == null) return;

            //insert in map
            //1 col
            if(!map.containsKey(col)) {
                map.put(col, new TreeMap<>());
            }
            //2 level
            if(!map.get(col).containsKey(level)) {
                map.get(col).put(level, new ArrayList<>());
            }

            map.get(col).get(level).add(root.data);

            dfs(root.left, col - 1, level + 1);
            dfs(root.right, col + 1, level + 1);
        }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
                if(root == null) return res;

                dfs(root, 0, 0);

                //column wise sorting
                for(Map.Entry<Integer, TreeMap<Integer, ArrayList<Integer>>> entry : map.entrySet()) {

                    TreeMap<Integer, ArrayList<Integer>> levelMap = entry.getValue();
                    ArrayList<Integer> list = new ArrayList<>();

                    //level wise sorting
                    for(Map.Entry<Integer, ArrayList<Integer>> subEntry : levelMap.entrySet()) {

                        ArrayList<Integer> subList = subEntry.getValue();
                        //Collections.sort(subList);
                        list.addAll(subList);
                    }

                    res.add(list);
                }

                return res;
        
    }
}