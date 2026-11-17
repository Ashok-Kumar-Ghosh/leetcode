class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            nums[i]=(int)Math.pow(t,2);
        }
        Arrays.sort(nums);
        return nums;
    }
}