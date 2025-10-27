class Solution {
    public int[] closestDivisors(int num) {
        int arr[]=new int[2];
        int diff=Integer.MAX_VALUE;
        for(int k=num+1;k<=num+2;k++){
            for(int i=(int)Math.sqrt(k);i>=1;i--){
                if(k%i==0){
                    int j=k/i;
                    if(Math.abs(i-j)<diff){
                        diff=Math.abs(i-j);
                        arr[0]=i;
                        arr[1]=j;
                    }
                    break;
                }
            }
        }
        return arr;
    }
}