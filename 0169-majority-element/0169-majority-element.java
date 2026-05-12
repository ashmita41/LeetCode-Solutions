class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        for (int num : nums) {
            if(hmap.containsKey(num) && hmap.get(num) >= n/2){
                return num;
            }
            if(hmap.containsKey(num)) {
                hmap.put(num, hmap.get(num) + 1);
            } else {
                hmap.put(num, 1);
            }
            System.out.println(hmap.get(num));
        }
        return -1;
    }
}