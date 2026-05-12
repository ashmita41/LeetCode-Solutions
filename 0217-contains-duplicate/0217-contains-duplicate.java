class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums) {
            if(hmap.containsKey(num)) {
                hmap.put(num, hmap.get(num) + 1);
            } else {
                hmap.put(num, 1);
            }
            if (hmap.get(num) > 1) {
                return true;
            }
        }
        return false;
    }
}