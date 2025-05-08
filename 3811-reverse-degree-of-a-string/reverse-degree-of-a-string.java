class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int j=1;
        for(int i=0;i<s.length();i++){
            int k=123-(int)s.charAt(i);
            sum+=k*j;
            j++;
        }
        return sum;
    }
}