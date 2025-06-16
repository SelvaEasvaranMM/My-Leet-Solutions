class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        for(int i:nums2){
            s2.add(i);
        }
        s1.retainAll(s2);
        int arr[]=new int[s1.size()];
        int k=0;
        for(int i:s1){
            arr[k++]=i;
        }
        return arr;
    }
}