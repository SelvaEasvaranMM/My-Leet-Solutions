class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0) c=freq[i];
        }
        System.out.print(c);
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0 && freq[i]!=c) return false;
        }
        return true;
    }
}