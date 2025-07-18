class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sk1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!sk1.isEmpty()){
                    sk1.pop();
                }
            }
            else sk1.push(c);
        }
        Stack<Character> sk2=new Stack<>();
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!sk2.isEmpty()){
                    sk2.pop();
                }
            }
            else sk2.push(ch);
        }
        String s1="";
        String s2="";
        for(char l:sk1) s1+=sk1;
        for(char p:sk2) s2+=sk2;
        if(s1.equals(s2)) return true;
        return false;
    }
}