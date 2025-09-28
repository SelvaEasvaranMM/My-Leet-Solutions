class Solution {
    public long countVowels(String word) {
        String vow="aeiou";
        long c=0;
        for(int i=0;i<word.length();i++){
            if(vow.indexOf(word.charAt(i))!=-1){
                long temp=(long)(i+1)*(word.length()-i);
                c+=temp;
            }
        }
        return c;
    }
}