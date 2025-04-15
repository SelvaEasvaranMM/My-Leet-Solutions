class Solution {
    public int findDuplicate(int[] nums) {
        /*boolean ans[]=new boolean[nums.length];
        for(int i:nums){
            if(ans[i]){
                return i;
            }
            else{
                ans[i]=true;
            }
        }
        return -1;*/
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }
            else{
                return nums[i];
            } 
        }
        return -1;
    }
}