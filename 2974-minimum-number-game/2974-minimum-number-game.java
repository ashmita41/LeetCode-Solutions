class Solution {
    public int[] numberGame(int[] nums) {
        int x = 1, y = 0;
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i+=2) {
            arr[x] = nums[i];
            x+=2;
        }
        for(int j = 1; j < nums.length; j+=2) {
            arr[y] = nums[j];
            y+=2;
        }
        return arr;
    }
}