class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        while(true){
            int pro=1;
            int x=temp;
            while(x!=0){
                int k=x%10;
                pro*=k;
                if(pro==0) break;
                x/=10;
            }
            if(pro%t==0) return temp;
            temp++;
        }
    }
}