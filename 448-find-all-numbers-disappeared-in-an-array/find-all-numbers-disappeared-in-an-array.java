class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!st.contains(i)) ls.add(i);
        }
        return ls;
    }
}