class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int k=Integer.bitCount(i);
            if(k==2 ||k==3 ||k==5 ||k==7 ||k==11 ||k==13 ||k==17 ||k==19) c++;
        }
        return c;
    }
}