class Solution {
    public int findDuplicate(int[] nums) {
        boolean ans[]=new boolean[nums.length];
        for(int i:nums){
            if(ans[i]){
                return i;
            }
            else{
                ans[i]=true;
            }
        }
        return -1;
    }
}