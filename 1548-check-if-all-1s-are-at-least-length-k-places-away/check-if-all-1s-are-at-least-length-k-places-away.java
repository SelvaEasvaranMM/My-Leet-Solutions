class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean firstOneFound=false;
        int zeroCount=0;
        for (int n:nums) {
            if(n==1) {
                if(firstOneFound && zeroCount<k) return false;
                firstOneFound=true;
                zeroCount=0;
            } 
            else if(firstOneFound) {
                zeroCount++;
            }
        }
        return true;
    }
}
