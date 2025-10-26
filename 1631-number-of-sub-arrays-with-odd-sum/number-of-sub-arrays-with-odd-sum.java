class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        long c=0;
        int even=1;
        int odd=0;
        int sum=0;
        for(int i:arr){
            sum=(sum+i)%2;
            if(sum==0){
                c+=odd;
                even++;
            }
            else{
                c+=even;
                odd++;
            }
            c%=mod;
        }
        return (int)c;
    }
}