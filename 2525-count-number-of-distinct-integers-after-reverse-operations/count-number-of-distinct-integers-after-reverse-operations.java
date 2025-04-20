class Solution {
    public int countDistinctIntegers(int[] nums) {
        int c=0;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
            int rev=0;
            while(nums[i]!=0){
                int k=nums[i]%10;
                rev=rev*10+k;
                nums[i]/=10;
            }
            st.add(rev);
        }
        for(int j:st){
            c++;
        }
        return c;
    }
}