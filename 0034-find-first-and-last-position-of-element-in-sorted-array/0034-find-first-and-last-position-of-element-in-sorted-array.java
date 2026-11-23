class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        if(nums.length==0){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        int s1=0;
        int e1=nums.length-1;
        while(s1<=e1){
            int m=s1-(s1-e1)/2;
            if(target>nums[m]){
                s1=m+1;
            }else if(target<=nums[m]){
                e1=m-1;
            }
        }
        int s2=0;
        int e2=nums.length-1;
        while(s2<=e2){
            int m=s2-(s2-e2)/2;
            if(target>=nums[m]){
                s2=m+1;
            }else if(target<nums[m]){
                e2=m-1;
            }
        }
        if (s1 <= e2) {
            a[0] = s1;
            a[1] = e2;
        } else {
            a[0] = -1;
            a[1] = -1;
        }
        return a;
    }
}