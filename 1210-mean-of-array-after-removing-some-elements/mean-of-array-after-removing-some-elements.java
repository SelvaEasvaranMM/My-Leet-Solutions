class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int remove=n/20;
        int sum=0;
        int c=0;
        for(int i=remove;i<n-remove;i++){
            sum+=arr[i];
            c++;
        }
        return (double)sum/c;
    }
}