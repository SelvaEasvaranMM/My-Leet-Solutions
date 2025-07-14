class Solution {
    public String removeDuplicates(String s) {
        String ans="";
        Stack<Character> sk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(sk.isEmpty()) sk.push(ch);
            else if(!sk.isEmpty()){
                if(sk.peek()==ch) sk.pop();
                else sk.push(ch);
            }
        }
        for(char c:sk){
            ans+=c;
        }
        return ans;
    }
}