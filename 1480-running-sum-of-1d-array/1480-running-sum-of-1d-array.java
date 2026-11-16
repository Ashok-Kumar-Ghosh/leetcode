class Solution {
    public int[] runningSum(int[] nums) {
        int [] a=new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++){
            a[i]=n+nums[i];
            n=n+nums[i];
        }
        return a;
    }
}