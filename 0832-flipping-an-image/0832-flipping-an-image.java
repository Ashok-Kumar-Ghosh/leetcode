class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] a=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=image.length-1;j>=0;j--){
                a[i][image.length-1-j]=image[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]==0){
                    a[i][j]=1;
                }else{
                    a[i][j]=0;
                }
            }
        }
        return a;
    }
}