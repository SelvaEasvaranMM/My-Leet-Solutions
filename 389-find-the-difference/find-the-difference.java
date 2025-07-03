class Solution {
    public char findTheDifference(String s, String t) {
        /*char ch[]=s.toCharArray();
        char c[]=t.toCharArray();
        char res=0;
        for(char i:ch) res^=i;
        for(char i:c) res^=i;
        return res;*/
        int freq[]=new int[26];
        for(char ch:s.toCharArray()) freq[ch-'a']++;
        for(char c:t.toCharArray()) freq[c-'a']--;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return (char) (i+'a');
        }
        return ' ';
    }
}