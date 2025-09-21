class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/3;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i:mp.keySet()){
            if(mp.get(i)>n) ls.add(i);
        }
        return ls;
    }
}