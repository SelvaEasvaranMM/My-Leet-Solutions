class Solution {
    public int sumFourDivisors(int[] nums) {
        int res=0;
        for(int i:nums){
            int c=0;
            int sum=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    int quo=i/j;
                    if(quo==j){
                        c++;
                        sum+=j;
                    }
                    else{
                        c+=2;
                        sum+=(quo+j);
                    }
                    if(c>4) break;
                }
            }
            if(c==4) res+=sum; 
        }
        return res;
    }
}