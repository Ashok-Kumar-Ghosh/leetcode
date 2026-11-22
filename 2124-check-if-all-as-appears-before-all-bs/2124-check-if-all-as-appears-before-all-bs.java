class Solution {
    public boolean checkString(String s) {
        boolean ans=true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='a' && s.charAt(i-1)=='b'){
                ans=false;
            }
        }
        return ans;
        
    }
}