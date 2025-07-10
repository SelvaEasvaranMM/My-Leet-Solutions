class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min) min=i;
            if(i>max) max=i;
        }
        int res=0;
        for(int i=1;i<=max;i++){
            if(min%i==0) {
                if(max%i==0) res=Math.max(res,i);
            }
        }
        return res;
    }
}