class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int steps=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                steps+=nums[i]-max;
            }else{
                steps+=max-nums[i];
            }
        }
        return steps;
        
    }
}