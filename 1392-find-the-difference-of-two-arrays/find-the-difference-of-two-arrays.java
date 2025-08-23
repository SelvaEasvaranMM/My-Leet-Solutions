class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        for(int i:nums1){
            if(!l1.contains(i)){
                l1.add(i);
            }
        }
        List<Integer> temp2=new ArrayList<>();
        for(int i:nums2){
            if(!l1.contains(i)){
                if(!temp2.contains(i)) temp2.add(i);
            }
        }
        List<Integer> l2=new ArrayList<>();
        for(int i:nums2){
            if(!l2.contains(i)){
                l2.add(i);
            }
        }
        List<Integer> temp1=new ArrayList<>();
        for(int i:nums1){
            if(!l2.contains(i)){
                if(!temp1.contains(i)) temp1.add(i);
            }
        }
        res.add(temp1);
        res.add(temp2);
        return res;
    }
}