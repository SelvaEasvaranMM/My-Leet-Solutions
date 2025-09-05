class Solution {
    public int secondHighest(String s) {
        int first=-1;
        int sec=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int dig=ch-'0';
                if(first<dig){
                    sec=first;
                    first=dig;
                }
                else if(dig<first && dig>sec){
                    sec=dig;
                }
            }
        }
        return sec;
    }
}