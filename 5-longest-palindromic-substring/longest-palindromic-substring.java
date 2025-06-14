class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String temp=s.substring(i,j+1);
                boolean isPalindrome=true;
                int st=0;
                int end=temp.length()-1;
                while(st<end){
                    if(temp.charAt(st)!=temp.charAt(end)){
                        isPalindrome=false;
                        break;
                    }
                    st++;
                    end--;
                }
                if(isPalindrome && ans.length()< temp.length()){
                    ans=temp;
                }
            }
        }
        return ans;
    }
}