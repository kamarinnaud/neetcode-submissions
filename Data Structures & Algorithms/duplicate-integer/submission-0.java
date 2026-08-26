class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet();
        for (int num : nums){
            dup.add(num);
        }

        if (dup.size() < nums.length){
            return true;
        } else return false;
    }
}