class Solution {
    public int firstMissingPositive(int[] nums) {
        int j=1;
        HashSet<Integer> st=new HashSet();
        for(int i:nums){
            st.add(i);
        }
        for(int i=0;i<nums.length+1;i++){
            if(!st.contains(j)) return j;
            else{
                j++;
            }
        }
        return -1;
    }
}