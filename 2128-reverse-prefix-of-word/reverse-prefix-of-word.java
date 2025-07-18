class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> sk=new Stack<>();
        for(char c:word.toCharArray()){
            if(c==ch){
                sk.push(c);
                break;
            }
            else sk.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char k:sk){
            sb.append(k);
        }
        sb.reverse();
        int st=0;
        int ind=0;
        while(st<word.length()){
            if(word.charAt(st)==ch){
                ind=st;
                break;
            }
            else st++;
        }
        ind=ind+1;
        for(int i=ind;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        if(word.indexOf(ch)==-1) return word;
        return sb.toString();
    }
}