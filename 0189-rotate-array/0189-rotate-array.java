class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int temp=nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            s++;
            e--;
        }
        int t=0;
        int f=k-1;
        while(t<f){
            int temp=nums[f];
            nums[f]=nums[t];
            nums[t]=temp;
            t++;
            f--;
        }
        int u=k;
        int g=nums.length-1;
        while(u<g){
            int temp=nums[g];
            nums[g]=nums[u];
            nums[u]=temp;
            u++;
            g--;
        }
        
    }
}