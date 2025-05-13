class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        /*int ans[]=new int[2];
        int freq[]=new int[50];
        TreeSet<Integer> st=new TreeSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                freq[grid[i][j]]++;
                st.add(grid[i][j]);       
            }
        }
        int j=1;
        for(int i:st){
            if(i==j) j++;
        }
        ans[1]=j;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                ans[0]=i;
                break;
            }
        }
        return ans;*/
        int actual=0;
        for(int i=1;i<=grid.length*grid.length;i++){
            actual+=i;
        }
        Set<Integer> st=new HashSet<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                st.add(grid[i][j]);
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
            }
        }
        int rep=0;
        for(Map.Entry<Integer,Integer> ent:mp.entrySet()){
            if(ent.getValue()>1){
                rep=ent.getKey();
            }
        }
        int sum=0;
        for(int i:st) sum+=i;
        int miss=actual-sum;
        return new int[]{rep,miss};
    }
}