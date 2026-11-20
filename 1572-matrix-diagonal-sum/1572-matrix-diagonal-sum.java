class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        int c=0;
        int r=mat.length-1;
        while(r>=0 && c<mat.length){
            sum+=mat[c][r];
            r--;
            c++;
        } 
        if(mat.length%2==0){
            return sum;
        }else{
            int n=(mat.length-1)/2;
            sum-=mat[n][n];
            return sum;
        }     
    }
}