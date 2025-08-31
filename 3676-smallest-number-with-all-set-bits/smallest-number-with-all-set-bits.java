class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        String res="";
        for(char ch:s.toCharArray()){
            if(ch=='0') res+='1';
            else res+=ch;
        }
        return Integer.parseInt(res,2);
    }
}