class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()) sb.append(ch);
        String res=sb.reverse().toString();
        for(int i=1;i<s.length();i++){
            for(int j=i;j<=i;j++){
                String temp=s.substring(i-1,j+1);
                if(res.contains(temp)) return true;
            }
        }
        return false;
    }
}