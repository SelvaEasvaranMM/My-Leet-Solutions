class Solution {
    public boolean isValid(String s) {
        /*while(s.length()!=0){
            if(s.contains("()")){
                s=s.replace("()","");
            }      
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","");
            }
            else return false;
        }
        return true;*/
        if(s.length()<=1) return false;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!st.isEmpty()){
                    if(st.peek()=='(') st.pop();
                    else{
                        st.push(ch);
                    }
                }
                else{
                    st.push(ch);
                }
            }
            else if(ch==']'){
                if(!st.isEmpty()){
                    if(st.peek()=='[') st.pop();
                    else{
                        st.push(ch);
                    }
                }
                else{
                    st.push(ch);
                }
            }
            else if(ch=='}'){
                if(!st.isEmpty()){
                    if(st.peek()=='{') st.pop();
                    else{
                        st.push(ch);
                    }
                }
                else{
                    st.push(ch);
                }
            } 
            else {
                st.push(ch);
            } 
        }
        if(st.isEmpty()) return true;
        return false;
    }
}