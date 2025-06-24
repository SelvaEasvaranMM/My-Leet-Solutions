class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ls=new ArrayList<>();
        Set<Integer> st=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)<=k && nums[j]==key) st.add(i);
            }
        }
        for(int i:st) ls.add(i);
        return ls;
    }
}