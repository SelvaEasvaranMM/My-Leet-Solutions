class Solution {
    public String triangleType(int[] nums) {
        String s1="equilateral";
        String s2="isosceles";
        String s3="scalene";
        String s4="none";
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a==b && b==c && c==a) return s1;
        else if(a==b || b==c ||a==c){
            if(a+b>c && a+c>b && b+c>a) return s2;
        }
        else if(a!=b && b!=c && a!=c){
            if(a+b>c && a+c>b && b+c>a) return s3;
        }
        return s4;
    }
}