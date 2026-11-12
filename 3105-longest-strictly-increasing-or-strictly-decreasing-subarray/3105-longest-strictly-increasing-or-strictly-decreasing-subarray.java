class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
        int dlen=1;
        int ilen=1;
        for(int i=0;i<nums.length;i++){
            int len1=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1]){
                    len1++;
                }else{
                    break;
                }
            }
            if(len1>ilen){
                ilen=len1;
            }
            int len2=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[j-1]){
                    len2++;
                }else{
                    break;
                }
            }
            if(len2>dlen){
                dlen=len2;
            }
        }
    
        return (int)Math.max(ilen,dlen);
    }
}