class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int pro=1;
        int count=0;
        int neg=0;

        for(int e:nums){
            if(e==0){
                pro=0;
                count++;
            }else{
                prod=prod*e;
            }
            if(e<0){
                neg++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0 && count==1){
                nums[i]=prod;
            }else if(nums[i]==0 && count>1){
                nums[i]=0;
            }
            else if((nums[i]<=0 && neg%2!=0 && prod>0)|| pro==0 ){
                nums[i]=0;
            }else{
                nums[i]=prod/nums[i];
            }
        }
        return nums; 
    }
}