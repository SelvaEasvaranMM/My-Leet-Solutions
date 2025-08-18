class Solution {
    public boolean isFascinating(int n) {
        String org=String.valueOf(n);
        String two=String.valueOf(n*2);
        String tri=String.valueOf(n*3);
        String res="";
        for(int i=0;i<org.length();i++){
            res+=org.charAt(i);   
        }
        for(int i=0;i<two.length();i++){
            res+=two.charAt(i);   
        }
        for(int i=0;i<tri.length();i++){
            res+=tri.charAt(i);   
        }
        if(res.contains("0")) return false;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<res.length();i++){
            mp.put(res.charAt(i),mp.getOrDefault(res.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> ent:mp.entrySet()){
            if(ent.getValue()>1) return false;
        }
        return true;
    }
}