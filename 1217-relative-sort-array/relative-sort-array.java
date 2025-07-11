class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length];
        int k=0;
        Map<Integer,Integer> mp=new TreeMap<>();
        for(int i:arr1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int j:arr2){
            int temp=mp.get(j);
            while(temp-->0){
                ans[k++]=j;
            }
            mp.remove(j);
        }
        for(int key:mp.keySet()){
            int m=mp.get(key);
            while(m-->0){
                ans[k++]=key;
            }
        }
        return ans;
    }
}