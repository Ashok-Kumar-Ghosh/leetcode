class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()
        steps=0
        med=0
        n=len(nums)
        if(n%2==0):
            med=math.ceil(nums[((n+1)//2)])
        else:
            med=math.ceil((nums[((n//2))]+nums[((n-1)//2)])//2)
        for i in range(0,len(nums)):
            if(nums[i]>med):
                steps+=nums[i]-med
            else:
                steps+=med-nums[i]
        return steps