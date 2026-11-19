class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            if((items.get(i).get(0).equals(ruleValue))&& ruleKey.equals("type")){
                count++;
            }else if((items.get(i).get(1).equals(ruleValue))&& ruleKey.equals("color")){
                count++;
            }else if((items.get(i).get(2).equals(ruleValue))&& ruleKey.equals("name")){
                count++;
            }
        }
        return count;
        
    }
}