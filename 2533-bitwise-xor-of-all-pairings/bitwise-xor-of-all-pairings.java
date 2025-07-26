class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0;
        int xor2=0;
        for(int i:nums1) xor1^=i;
        for(int i:nums2) xor2^=i;
        int res=0;
        if(nums1.length%2==1) res^=xor2; 
        if(nums2.length%2==1) res^=xor1;
        return res; 
    }
}