class Solution {
    public int sumBase(int n, int k) {
        String temp=Integer.toString(n,k);
        int ans=Integer.parseInt(temp);
        int sum=0;
        while(ans!=0){
            int l=ans%10;
            sum+=l;
            ans/=10;
        }
        return sum;
    }
}