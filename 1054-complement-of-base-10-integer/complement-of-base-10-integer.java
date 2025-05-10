class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                str+='1';
            }
            else{
                str+='0';
            }
        }
        int k=Integer.parseInt(str,2);
        return k;
    }
}