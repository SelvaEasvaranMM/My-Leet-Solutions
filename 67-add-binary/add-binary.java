import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger sum=new BigInteger(a,2).add(new BigInteger(b,2));
        return sum.toString(2);
    }
}