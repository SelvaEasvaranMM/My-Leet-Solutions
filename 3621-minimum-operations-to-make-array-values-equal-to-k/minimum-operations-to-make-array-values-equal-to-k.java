class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int c=0;
        for(int n:set){
            if(n>k){
            c++;
            }
            else if(n<k){
                return -1;
            }
        }
        return c;
    }
}