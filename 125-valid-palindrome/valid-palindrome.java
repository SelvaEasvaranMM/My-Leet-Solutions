class Solution {
    public boolean isPalindrome(String s) {
        /*String str="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c){
                str+=c;
            }
        }*/
        //REGEX METHOD
        String str=s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String rev=new StringBuilder(str).reverse().toString();
        return rev.equals(str);
    }
}