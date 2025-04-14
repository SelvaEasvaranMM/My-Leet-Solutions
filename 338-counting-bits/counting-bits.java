class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int k=0;
        for(int i=0;i<=n;i++){
            ans[k++]=Integer.bitCount(i);
        }
        return ans;
    }
}