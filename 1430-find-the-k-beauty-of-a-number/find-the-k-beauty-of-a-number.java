class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i<=s.length()-k;i++){
            String temp=s.substring(i,i+k);
            int m=Integer.parseInt(temp);
            if(m!=0 && num%m==0) c++;
        }
        return c;
    }
}