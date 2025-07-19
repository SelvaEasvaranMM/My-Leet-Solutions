class Solution {
    public String makeGood(String s) {
        String res="";
        Stack<Character> sk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                if(!sk.isEmpty()){
                    if(sk.peek()>='A' && sk.peek()<='Z'){
                        if(sk.peek()==(char)(ch-32)){
                            sk.pop();
                        }
                        else{
                            sk.push(ch);
                        }
                    }
                    else{
                        sk.push(ch);
                    }
                }
                else{
                    sk.push(ch);
                }
            }
            else if(Character.isUpperCase(ch)){
                if(!sk.isEmpty()){
                    if(sk.peek()>='a' && sk.peek()<='z'){
                        if(sk.peek()==(char)(ch+32)){
                            sk.pop();
                        }
                        else{
                            sk.push(ch);
                        }
                    }
                    else{
                        sk.push(ch);
                    }
                }
                else{
                    sk.push(ch);
                }
            }
        }
        for(char c:sk) res+=c;
        return res;
    }
}