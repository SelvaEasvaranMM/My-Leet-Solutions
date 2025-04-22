class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0; //total
        int val=0; //get value from char
        for(char ch:columnTitle.toCharArray()){
            sum*=26; //set base to 26 if i/p length is 2 or more
            val=1+(ch-'A');
            sum+=val;
        }
        return sum;
    }
}