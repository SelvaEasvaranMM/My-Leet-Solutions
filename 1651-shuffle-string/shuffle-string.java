class Solution {
    public String restoreString(String s, int[] indices) {
        String ans="";
        char arr[]=new char[s.length()];
        int ind=0;
        for(char ch:s.toCharArray()) arr[ind++]=ch;
        char res[]=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            res[indices[i]]=arr[i];
        }
        for(int i=0;i<res.length;i++){
            ans+=res[i];
        }
        return ans;
    }
}