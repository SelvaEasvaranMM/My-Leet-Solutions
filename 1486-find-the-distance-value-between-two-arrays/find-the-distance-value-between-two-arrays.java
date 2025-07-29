class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int c=0;
        for(int i:arr1){
            if(isValid(i,arr2,d)) c++;
        }
        return c;
    }
    private boolean isValid(int num,int []arr2,int d){
        int st=0;
        int end=arr2.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int diff=Math.abs(num-arr2[mid]);
            if(diff<=d) return false;
            else if(arr2[mid]<num){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return true;
    }
}