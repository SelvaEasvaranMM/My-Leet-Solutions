class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int res[]=new int[nums.length];
        int pre[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int left=nums[i]*i-(i>0?pre[i-1]:0);
            int right=(pre[nums.length-1]-pre[i])-nums[i]*(nums.length-i-1);
            res[i]=left+right;
        }
        return res;
    }
}