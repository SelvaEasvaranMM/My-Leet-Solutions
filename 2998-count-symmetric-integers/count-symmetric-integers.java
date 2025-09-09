class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String temp=String.valueOf(i);
            int fsum=0;
            int lsum=0;
            if(temp.length()%2==0){
                for(int j=0;j<temp.length()/2;j++){
                    fsum+=temp.charAt(j)-'0';
                }
                for(int k=temp.length()/2;k<temp.length();k++){
                    lsum+=temp.charAt(k)-'0';
                }
            }
            if(fsum==0 && lsum==0) continue;
            if(fsum==lsum) c++;
        }
        return c;
    }
}