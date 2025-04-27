class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int c=0;
        int temp=sum;
        while(temp%k!=0){
            c++;
            temp--;
        }
        return c;
    }
}