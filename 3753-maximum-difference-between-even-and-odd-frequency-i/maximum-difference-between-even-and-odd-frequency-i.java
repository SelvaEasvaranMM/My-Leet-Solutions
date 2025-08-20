class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int oddmax=Integer.MIN_VALUE;
        int evmax=Integer.MAX_VALUE;
        for(int i:freq){
            if(i>0){
                if(i%2!=0){
                    oddmax=Math.max(oddmax,i);
                }
                else{
                    evmax=Math.min(evmax,i);
                }
            }
        }
        if(oddmax==Integer.MIN_VALUE || evmax==Integer.MAX_VALUE) return 0;
        return oddmax-evmax;
    }
}