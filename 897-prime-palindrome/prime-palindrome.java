class Solution {
    public int primePalindrome(int n) {
        for(int i=n; ;i++){
            String k=String.valueOf(i);
            if(isprime(i) && palin(k)) return i;
            if (10000000 < i && i < 100000000) i=100000000-1;
        }
    }
    public static boolean isprime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static boolean palin(String s){
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)) return false;
            else{
                st++;
                end--;
            }
        }
        return true;
    }
}