class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;*/
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            if(!st.add(i)) return true;
        }
        return false;
    }
}