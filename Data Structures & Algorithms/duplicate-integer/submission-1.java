class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> map = new HashSet<>();
        for (int i : nums){
            if(map.contains(i)){
                return true;
            } 
            map.add(i);
        }
        return false;
    }
}