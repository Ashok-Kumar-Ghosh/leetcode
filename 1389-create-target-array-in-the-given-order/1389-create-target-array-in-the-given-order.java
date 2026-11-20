class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        int[] arr=new int[a.size()];
        for(int i=0;i<nums.length;i++){
            arr[i]=a.get(i);
        }
        return arr;

    }

}