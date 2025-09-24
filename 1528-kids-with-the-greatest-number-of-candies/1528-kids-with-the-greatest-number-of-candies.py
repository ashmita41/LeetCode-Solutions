class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        maxCandy = max(candies)
        n = len(candies)
        ans = [False] * n
        for i in range(n):
            if candies[i] + extraCandies >= maxCandy:
                ans[i] = True

        return ans
