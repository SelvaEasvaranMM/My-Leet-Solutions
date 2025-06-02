class Solution {
    public int xorBeauty(int[] nums) {
        int l=0;
        for(int i:nums){
            l^=i;
        }
        return l;
    }
}