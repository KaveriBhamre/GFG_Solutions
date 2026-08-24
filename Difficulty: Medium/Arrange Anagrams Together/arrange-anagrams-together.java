class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for(String s : arr) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            
            ArrayList<String> list = map.get(key);
            
            if(list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(s);
            
        }
        
        return new ArrayList<>(map.values());
    }
}