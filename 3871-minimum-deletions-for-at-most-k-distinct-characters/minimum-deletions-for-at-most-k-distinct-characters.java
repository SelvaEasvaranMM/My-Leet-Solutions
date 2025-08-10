class Solution {
    public int minDeletion(String s, int k) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int c=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0) c++;
        }
        int ans=0;
        int ind=0;
        while(c>k && ind<26){
            if(freq[ind]>0){
                ans+=freq[ind];
                c--;
            }
            ind++;
        }
        return ans;
    }
}