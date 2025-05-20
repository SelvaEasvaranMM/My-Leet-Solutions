class Solution {
    public long[] sumOfThree(long num) {
        long ans[]=new long[3];
        long i=num/3;
        if((i-1)+(i)+(i+1)==num){
            ans[0]=i-1;
            ans[1]=i;
            ans[2]=i+1;
            return ans;
        }
        return new long[]{};
    }
}