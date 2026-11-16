class Solution {
    public int trailingZeroes(int n) {
        int tc=0;
        int fc=0;
        for(int i=2;i<=n;i=i*2){
            tc+=(int)Math.floor(n/i);
        }
        for(int i=5;i<=n;i=i*5){
            fc+=(int)Math.floor(n/i);
        }
        return (int)Math.min(tc,fc);  
    }
}