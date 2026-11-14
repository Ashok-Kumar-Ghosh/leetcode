class Solution {
    public double average(int[] salary) {
        int min=salary[0];
        for(int i=0;i<salary.length;i++){
            if ( salary[i]<min){
                min=salary[i];
            }
        }
        int max=salary[0];
        for(int i=0;i<salary.length;i++){
            if ( salary[i]>max){
                max=salary[i];
            }
        }
        int sum=0;
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        sum-=min;
        sum-=max;
        double n=(double)(salary.length-2);
        return (double)(sum/n);
        
    }
}