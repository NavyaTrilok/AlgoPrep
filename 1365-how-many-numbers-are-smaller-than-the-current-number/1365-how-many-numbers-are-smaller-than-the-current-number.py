class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        res = []
        for i in range(len(nums)):
            count = 0
            for j in range(len(nums)):
                if nums[i] > nums[j]:
                    count+=1
            res.append(count)
        return res
                    
        