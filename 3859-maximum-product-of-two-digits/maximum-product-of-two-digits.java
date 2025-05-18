class Solution {
    public int maxProduct(int n) {
        String str=String.valueOf(n);
        int res=0;
        for(int i=0;i<str.length();i++){
            int max=0;
            for(int j=i+1;j<str.length();j++){
                int k=(str.charAt(i)-'0')*(str.charAt(j)-'0');
                if(max<k) max=k;
            }
            if(res<max) res=max;
        }
        return res;
    }
}