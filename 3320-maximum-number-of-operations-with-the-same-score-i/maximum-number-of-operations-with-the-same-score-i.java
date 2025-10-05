class Solution {
    public int maxOperations(int[] nums) {
        int sum=nums[0]+nums[1];
        int c=1;
        for(int i=2;i<nums.length-1;i+=2){
            int temp=nums[i]+nums[i+1];
            if(sum==temp) c++;
            else break;
        }
        return c;
    }
}