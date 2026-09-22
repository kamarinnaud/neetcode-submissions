class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            
            map.computeIfAbsent(new String(sorted), k -> new ArrayList<>()).add(str);
        }

        List<List<String>> ret = new ArrayList<>();
        for (List<String> list : map.values()){
            ret.add(list);
        }

        return ret;
    }
}
