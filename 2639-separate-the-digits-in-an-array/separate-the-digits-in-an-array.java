class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String temp=String.valueOf(nums[i]);
            int st=0;
            while(st<temp.length()){
                ls.add(temp.charAt(st)-'0');
                st++;
            }
        }
        int ind=0;
        int ans[]=new int[ls.size()];
        for(int i:ls) ans[ind++]=i;
        return ans;
    }
}