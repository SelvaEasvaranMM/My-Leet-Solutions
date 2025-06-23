class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        Set<Integer> st=new TreeSet<>();
        for(int i:nums){
            st.add(i);
        }
        int k=0;
        for(int j:st){
            nums[k++]=j;
            c++;
        }
        return c;
    }
}