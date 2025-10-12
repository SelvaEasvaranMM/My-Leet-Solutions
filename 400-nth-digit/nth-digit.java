class Solution {
    public int findNthDigit(int n) {
        int d=1;
        long longdigit=9;
        while(n>d*longdigit){
            n-=d*longdigit;
            d++;
            longdigit*=10;
        }
        long large=(long)Math.pow(10,(d-1));
        long temp=large+(n-1)/d;
        String s=String.valueOf(temp);
        return s.charAt((n-1)%d)-'0';
    }
}