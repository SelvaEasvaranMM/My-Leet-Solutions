class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2); 
        /*if(n<=1) return n;
        int a=0; //1 1
        int b=1; //1 2
        for(int i=2;i<=n;i++){
            int temp=b; // 1 1
            b=a+b; // 1 2
            a=temp; //1 1
        }
        return b;*/
    }
}