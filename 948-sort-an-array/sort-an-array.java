class Solution {
    public int[] sortArray(int[] nums) {
        int ans[]=new int[nums.length];
        Arrays.sort(nums);
        int k=0;
        for(int i:nums){
            ans[k++]=i;
        }
        return ans;
    }
}