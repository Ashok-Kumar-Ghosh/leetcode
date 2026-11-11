class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost=0;
        if(need1>=need2){
           long c1=(long)need1*(long)costBoth;
           long c2=((long)need1*(long)cost1)+((long)need2*(long)cost2);
           long c3=((long)need2*(long)costBoth)+((long)(need1-need2)*(long)cost1);
           if(c1<=c2 && c1<=c3){
            cost=c1;
           }else if(c2<=c1 && c2<=c3){
            cost=c2;
           }else{
            cost=c3;
           }

        }else if(need2>need1){
            long c1=(long)need2*(long)costBoth;
            long c2=((long)need1*(long)cost1)+((long)need2*(long)cost2);
            long c3=((long)need1*(long)costBoth)+((long)(need2-need1)*(long)cost2);
            if(c1<=c2 && c1<=c3){
            cost=c1;
           }else if(c2<=c1 && c2<=c3){
            cost=c2;
           }else{
            cost=c3;
           }
        }
        return cost;
       
    }
}