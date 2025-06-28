class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res=0;
        int ans[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i:nums1) ans[k++]=i;
        for(int j:nums2) ans[k++]=j;
        Arrays.sort(ans);
        int med=ans.length/2;
        if(ans.length%2==0){
            float temp=ans[med-1]+ans[med];
            res=temp/2;
            return res;
        }
        return (double)ans[ans.length/2];
    }
}