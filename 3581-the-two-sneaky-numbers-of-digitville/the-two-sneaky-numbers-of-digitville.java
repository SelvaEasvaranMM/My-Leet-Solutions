class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j])
                c++;
            }
            if(c==1){
                ans[k++]=nums[i];
            }
        }
        return ans;
    }
}