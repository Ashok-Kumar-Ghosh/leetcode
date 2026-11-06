class Solution {
    public int[] plusOne(int[] digits) {
        int over=0;
        int [] a=digits.clone();
        int rem=1;
        for(int i=digits.length-1;i>=0;i--){
            int d=digits[i]+rem;
            if(i!=0){
                if(d>9){
                    a[i]=d%10;
                    rem=1;
                }else{
                    a[i]=d;
                    rem=0;
                }
            }else{
                if(d>9){
                    over++;
                }else{
                    a[i]=d;
                }
            }
        }
        int [] b=new int[a.length+1];
        if (over>0){
            int re=1;
            for(int i=digits.length-1;i>=0;i--){
            int d=digits[i]+re;
            if(d>9){
                b[i+1]=d%10;
                re=1;
            }else{
                b[i+1]=d;
                re=0;
            }
            b[0]=1;
            }
        }
        if(over>0){
            return b;
        }
        return a;
        
    }
}
