class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        for(int i:nums) sum|=i;
        return sum*(1<<nums.length-1);
    }
}
