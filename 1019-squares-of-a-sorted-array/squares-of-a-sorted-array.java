class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i:nums){
            ls.add((int)Math.pow(i,2));
        }
        Collections.sort(ls);
        int arr[]=new int[ls.size()];
        int k=0;
        for(int i:ls){
            arr[k]=i;
            k++;
        }
        return arr;
    }
}