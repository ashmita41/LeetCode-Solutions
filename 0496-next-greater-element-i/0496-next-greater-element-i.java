class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k = 0;
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            Stack<Integer> st = new Stack<>();

            for (int j = nums2.length - 1; j >= 0; j--) {
                while(!st.isEmpty() && st.peek() <= nums2[j]) {
                    st.pop();
                }

                if(nums1[i] == nums2[j]) {
                    if(st.isEmpty()) {
                        ans[i] = -1;
                    } else {
                        ans[i] = st.peek();
                    }
                } 

                st.push(nums2[j]);
            }
        }

        return ans;
    }
}