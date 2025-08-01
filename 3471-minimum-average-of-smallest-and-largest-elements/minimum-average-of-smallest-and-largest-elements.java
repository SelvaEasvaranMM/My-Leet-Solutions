class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int st=0;
        int end=nums.length-1;
        float res=Float.MAX_VALUE;
        while(st<end){
            float avg=(float)(nums[st]+nums[end])/2;
            res=Math.min(res,avg);
            st++;
            end--;
        }
        return (double)res;
    }
}