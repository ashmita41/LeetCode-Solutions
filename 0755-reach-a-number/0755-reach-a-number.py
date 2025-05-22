class Solution(object):
    def reachNumber(self, target):
        """
        :type target: int
        :rtype: int
        """
        target = abs(target)  
    
        n = 0
        sum_n = 0
        
        while sum_n < target:
            n += 1
            sum_n += n
        
        diff = sum_n - target
        
        if diff % 2 == 0:
            return n
        
        while (sum_n - target) % 2 != 0:
            n += 1
            sum_n += n
        
        return n
        