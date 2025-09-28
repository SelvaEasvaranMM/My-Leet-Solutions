class Solution {
    public int numSub(String s) {
        int c=0;
        int mod=1000000007;
        int len=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                len++;
                c+=len;
                c%=mod;
            }
            else len=0;
        }
        return c;
    }
}