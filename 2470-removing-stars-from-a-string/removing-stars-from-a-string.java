class Solution {
    public String removeStars(String s) {
        Stack<Character> sk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*') sk.pop();
            else sk.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!sk.isEmpty()){
            sb.append(sk.pop());
        }
        return sb.reverse().toString();
    }
}