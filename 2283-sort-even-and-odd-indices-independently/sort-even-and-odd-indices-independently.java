class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> ev=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ev.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(ev);
        Collections.sort(odd);
        Collections.reverse(odd);
        int e=0;
        int o=0;
        int k=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0) ans[k++]=ev.get(e++);
            else ans[k++]=odd.get(o++);
        }
        return ans;
    }
}