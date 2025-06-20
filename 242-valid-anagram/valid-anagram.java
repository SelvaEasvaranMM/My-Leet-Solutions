class Solution {
    public boolean isAnagram(String s, String t) {
        /*char c[]=s.toCharArray();
        char ch[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        return Arrays.equals(c,ch);*/

        /*int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        for(int n:freq){
            if(n!=0) return false;
        }
        return true;*/
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)-1);
        }
        for(int i:mp.values()){
            if(i!=0) return false;
        }
        return true;
    }
}