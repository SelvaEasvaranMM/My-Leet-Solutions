class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        int ans=0;
        while(rev!=0){
            int k=rev%10;
            ans=ans*10+k;
            rev/=10;
        }
        if(temp==ans) return true;
        return false;
    }
}