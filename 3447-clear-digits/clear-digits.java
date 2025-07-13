class Solution {
    public String clearDigits(String s) {
        String ans="";
        Stack<Character> sk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                if(!sk.isEmpty()){
                    sk.pop();
                }
            }
            else{
                sk.push(ch);
            }
        }
        for(char c:sk){
            ans+=c;
        }
        return ans;
    }
}