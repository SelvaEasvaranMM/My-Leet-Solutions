class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        String vowel="aeiou";
        int k=0;
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(vowel.indexOf(s.charAt(i))!=-1){
                continue;
            }
            else{
                k=i;
                c++;
                break;
            }
        }
        if(c>0) for(int i=0;i<=k;i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}