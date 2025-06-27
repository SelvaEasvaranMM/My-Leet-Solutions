class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        int end=s.length()-1;
        while(end>=0 && s.charAt(end)==' ') end--;
        while(end>=0 && s.charAt(end)!=' '){
            len++;
            end--;
        }
        return len;
    }
}