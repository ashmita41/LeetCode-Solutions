class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        n = len(nums)
        ans = [1]*n

        for i in range(1,n):
            ans[i] = ans[i-1] * nums[i-1]

        suffix = 1
        for i in range(n-1, -1,-1):
            ans[i] *= suffix
            suffix *= nums[i]
        
        return ans