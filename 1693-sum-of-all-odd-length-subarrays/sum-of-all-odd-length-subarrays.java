class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        int k=1;
        while(k<=n){
            int temp=0;
            for(int i=0;i<k;i++){
                temp+=arr[i];
            }
            sum+=temp;
            for(int i=k;i<n;i++){
                temp+=arr[i]-arr[i-k];
                sum+=temp;
            }
            k+=2;
        }
        return sum;
    }
}