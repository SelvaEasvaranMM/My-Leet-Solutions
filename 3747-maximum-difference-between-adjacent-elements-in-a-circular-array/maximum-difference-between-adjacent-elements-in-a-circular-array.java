class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int p=(i+1)%nums.length;
            int diff=Math.abs(nums[i]-nums[p]);
            max=Math.max(max,diff);
        }
        return max;
    }
}