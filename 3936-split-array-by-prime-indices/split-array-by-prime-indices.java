class Solution {
    public long splitArray(int[] nums) {
        long arr1=0;
        long arr2=0;
        for(int i=0;i<nums.length;i++){
            if(isprime(i)){
                arr1+=nums[i];
            }
            else arr2+=nums[i];
        }
        long ans=Math.abs(arr1-arr2);
        return ans;
    }
    public static boolean isprime(int p){
        if(p<=1) return false;
        if(p==2) return true;
        if(p%2==0) return false;
        for(int i=3;i<=Math.sqrt(p);i+=2){
            if(p%i==0) return false;
        }
        return true;
    }
}