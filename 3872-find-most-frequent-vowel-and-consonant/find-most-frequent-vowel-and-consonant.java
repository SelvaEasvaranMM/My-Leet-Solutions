class Solution {
    public int maxFreqSum(String s) {
        char freq[]=new char[26];
        for(char ch:s.toCharArray()){
            freq[ch-97]++;
        }
        int max1=0;
        int max2=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if((char)(i+'a')=='a'||(char)(i+'a')=='e'||(char)(i+'a')=='i'||
                (char)(i+'a')=='o'||(char)(i+'a')=='u'){
                    max1=Math.max(max1,freq[i]);
                }
                else{
                    max2=Math.max(max2,freq[i]);
                }
            }
        }
        return max1+max2;
    }
}