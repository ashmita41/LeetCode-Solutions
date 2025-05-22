class Solution(object):
    def minEatingSpeed(self, piles, h):
        """
        :type piles: List[int]
        :type h: int
        :rtype: int
        """

        def canFinish(k):
            hours = 0
            for pile in piles:
                hours += (pile + k - 1) // k  # Ceiling division
            return hours <= h
    
        left, right = 1, max(piles)
    
        while left < right:
            mid = (left + right) // 2
            if canFinish(mid):
                right = mid  # mid works, try smaller
            else:
                left = mid + 1  # mid doesn't work, need bigger
    
        return left