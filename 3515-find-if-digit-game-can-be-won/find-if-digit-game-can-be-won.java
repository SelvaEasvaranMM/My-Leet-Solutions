class Solution {
    public boolean canAliceWin(int[] nums) {
        int sin=0;
        int two=0;
        for(int i:nums){
            if(i<10) sin+=i;
            else two+=i;
        }
        return sin!=two;
    }
}