class Solution {
    public int countDigitOne(int n) {
        if(n<=0) return 0;
        long c=0;
        long st=1;
        while(st<=n){
            long low=n%st;
            long curr=(n/st)%10;
            long high=n/(st*10);
            if(curr==0){
                c+=high*st;
            }
            else if(curr==1){
                c+=high*st+low+1;
            }
            else{
                c+=(high+1)*st;
            }
            st*=10;
        }
        return (int)c;
    }
}