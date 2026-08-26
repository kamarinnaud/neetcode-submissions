class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            boolean ret = set.add(num);
            if (!ret) return true;
        }

        return false;
    }
}