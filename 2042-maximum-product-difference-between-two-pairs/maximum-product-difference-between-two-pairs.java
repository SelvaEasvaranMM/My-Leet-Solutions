class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int a=nums[0];
        int b=nums[1];
        int c=nums[nums.length-2];
        int d=nums[nums.length-1];
        ans=(c*d)-(a*b);
        return ans;
    }
}