import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i:num){
            sb.append(String.valueOf(i));
        }
        BigInteger a=new BigInteger(sb.toString());
        BigInteger b=a.add(BigInteger.valueOf(k));
        String temp=String.valueOf(b);
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<temp.length();i++){
            ls.add(temp.charAt(i)-'0');
        }
        return ls;
    }
}