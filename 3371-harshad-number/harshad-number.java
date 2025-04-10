class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;
        while(x!=0){
            int d=x%10;
            sum+=d;
            x/=10;
        }
        if(temp%sum==0){
            return sum;
        }
        return -1;
    }
}