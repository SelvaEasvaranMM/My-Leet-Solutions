class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums1) mp.put(i,mp.getOrDefault(i,0)+1);
        List<Integer> ls=new ArrayList<>();
        for(int j:nums2){
            if(mp.containsKey(j) && mp.get(j)>0){
                ls.add(j);
                mp.put(j,mp.get(j)-1);
            }
        }
        int ans[]=new int[ls.size()];
        int k=0;
        for(int i:ls) ans[k++]=i;
        return ans; 
    }
}