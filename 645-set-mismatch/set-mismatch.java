class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> st=new TreeSet<>();
        List<Integer> ls=new ArrayList<>();
        for(int i:nums){
            if(!st.contains(i)){
                st.add(i);
            }
            else ls.add(i);
        }
        int n=nums.length;
        int total=(n*(n+1)/2);
        for(int i:st){
            total-=i;
        }
        int ans[]=new int[2];
        ans[0]=ls.get(0);
        ans[1]=total;
        return ans;
    }
}