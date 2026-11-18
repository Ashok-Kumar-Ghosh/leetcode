class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=0;
            int k=nums[i];
            while(k>0){
                n++;
                k=k/10;
            }
            if(n%2==0){
                count++;
            }
        }
        return count;

        
    }
}