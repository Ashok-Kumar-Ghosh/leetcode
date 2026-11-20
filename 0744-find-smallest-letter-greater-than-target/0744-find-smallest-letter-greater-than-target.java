class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(target>=letters[letters.length-1] || target<letters[0]){
            return letters[0];
        }else{
            while(start<=end){
                int mid=start-(start-end)/2;
                if(target>=letters[mid]){
                    start=mid+1;
                }else if(target<letters[mid]){
                    end=mid-1;
                }
            }
            if(start<=(letters.length-1)){
                        return letters[start];
                    }else{
                        return letters[0];
                    }
        }
    }
}