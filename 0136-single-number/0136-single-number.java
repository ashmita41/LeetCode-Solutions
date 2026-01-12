class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            if(freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num)+1);
            } else {
                freqMap.put(num,1);
            }
        }

        for(int num: nums) {
            if(freqMap.get(num) == 1) {
                return num;
            }
        }

        return -1;

    
    }
}