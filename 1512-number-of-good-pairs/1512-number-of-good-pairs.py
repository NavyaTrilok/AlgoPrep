class Solution(object):
    def numIdenticalPairs(self, nums):
        count = 0
        for i in range(len(nums)):
            for j in range(len(nums)-1, -1, -1):
                
                print(j)
                if nums[i] == nums[j] and i < j:
                    count+=1
        return count
                
                
        