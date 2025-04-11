class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }
            else{
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}