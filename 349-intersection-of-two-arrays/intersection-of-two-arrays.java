class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*Set<Integer> s1=new HashSet<>();
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
        return arr;*/
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    st.add(nums1[i]);
                }
            }
        }
        int res[]=new int[(st.size())];
        int k=0;
        for(int i:st){
            res[k++]=i;
        }
        return res;
    }
}