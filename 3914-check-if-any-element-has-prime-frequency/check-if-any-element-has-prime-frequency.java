class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(isprime(freq[i])) return true;
        }
        return false;
    }
    public static boolean isprime(int l){
        if(l<=1) return false;
        if(l==2) return true;
        if(l%2==0) return false;
        for(int i=3;i<=Math.sqrt(l);i++){
            if(l%i==0) return false;
        }
        return true;
    }
}