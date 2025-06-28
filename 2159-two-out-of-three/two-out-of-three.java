class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res=new ArrayList<>();

        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();

        for(int i:nums1) s1.add(i);
        for(int i:nums2) s2.add(i);
        for(int i:nums3) s3.add(i);

        int freq[]=new int[101];
        for(int i:s1)freq[i]++;
        for(int i:s2)freq[i]++;
        for(int i:s3)freq[i]++;

        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2) res.add(i);
        }
        return res;
    }
}