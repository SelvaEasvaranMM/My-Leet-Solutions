class Solution {
    public boolean isValid(String word) {
        String vowel="AEIOUaeiou";
        String num="0123456789";
        int n=0;
        int v=0;
        int cons=0;
        if(word.length()<3) return false;
        for(char ch:word.toCharArray()){
            if(num.indexOf(ch)!=-1) n++;
            else if(vowel.indexOf(ch)!=-1){
                v++;
            }
            else if(Character.isLetter(ch)){
                cons++;
            }
            else{
                return false;
            }
        }
        return(v>0 && cons>0);
    }
}