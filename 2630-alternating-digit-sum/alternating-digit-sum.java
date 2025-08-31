class Solution {
    public int alternateDigitSum(int n) {
        String temp=String.valueOf(n);
        int neg=0;
        int pos=0;
        for(int i=0;i<temp.length();i+=2){
            pos+=temp.charAt(i)-'0';
        }
        for(int i=1;i<temp.length();i+=2){
            neg+=temp.charAt(i)-'0';
        }
        return pos-neg;
    }
}