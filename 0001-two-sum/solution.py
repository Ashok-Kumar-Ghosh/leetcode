class Solution(object):
    def twoSum(self, nums, target):
        k=[]
        for i in range(0,len(nums)):
            l=target-nums[i]
            for j in range(i+1,len(nums)):
                if nums[j]==l:
                    k.append(i)
                    k.append(j)
                    return k
