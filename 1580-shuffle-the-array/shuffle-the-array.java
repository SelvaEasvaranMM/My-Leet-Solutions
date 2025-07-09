class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int arr1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            arr1[k++]=nums[i];
        }
        int l=0;
        int arr2[]=new int[n];
        for(int i=n;i<nums.length;i++){
            arr2[l]=nums[i];
            l++;
        }
        int st=0;
        int p=0;
        while(st<n){
            ans[p++]=arr1[st];
            ans[p++]=arr2[st];
            st++;
        }
        return ans;
    }
}