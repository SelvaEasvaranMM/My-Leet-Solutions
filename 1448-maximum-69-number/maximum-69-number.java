class Solution {
    public int maximum69Number (int num) {
        /*String s=(num+"");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='9'){
                s.charAt(i)='6';
            }
        }
        return Integer.parseInt(s);*/
        return Integer.parseInt((num+"").replaceFirst("6","9"));
    }
}