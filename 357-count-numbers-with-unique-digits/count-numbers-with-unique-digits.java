class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int c=10;  // 91 739
        int uniquedigit=9;  //81 648
        int availdigit=9;  // 8 7
        for(int i=2;i<=n && availdigit>0;i++){
            uniquedigit=uniquedigit*availdigit;
            c+=uniquedigit;
            availdigit--;
        }
        return c;
    }
}