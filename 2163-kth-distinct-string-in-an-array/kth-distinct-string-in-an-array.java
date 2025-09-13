class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mp=new LinkedHashMap<>();
        for(String i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int c=1;
        for(Map.Entry<String,Integer> ent:mp.entrySet()){
            if(ent.getValue()<2){
                if(c==k) return ent.getKey();
                else c++;
            }
        }
        return "";
    }
}