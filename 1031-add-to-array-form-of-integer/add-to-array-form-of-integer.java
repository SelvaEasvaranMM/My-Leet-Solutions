import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i:num){
            sb.append(String.valueOf(i));
        }
        BigInteger a=new BigInteger(sb.toString());
        BigInteger b=new BigInteger(String.valueOf(k));
        BigInteger val=a.add(b);
        String temp=String.valueOf(val);
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<temp.length();i++){
            ls.add(temp.charAt(i)-'0');
        }
        return ls;
    }
}