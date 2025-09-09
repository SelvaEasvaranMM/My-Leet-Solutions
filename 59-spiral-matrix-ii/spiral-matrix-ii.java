class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        int top_r=0;
        int bottom_r=n-1;
        int left_c=0;
        int right_c=n-1;
        int num=1;
        while(top_r<=bottom_r && left_c<=right_c){
            for(int i=left_c;i<=right_c;i++){
                ans[top_r][i]=num++;
            }
            top_r++;
            for(int i=top_r;i<=bottom_r;i++){
                ans[i][right_c]=num++;
            }
            right_c--;
            if(top_r<=bottom_r){
                for(int i=right_c;i>=left_c;i--){
                    ans[bottom_r][i]=num++;
                }
            }
            bottom_r--;
            if(left_c<=right_c){
                for(int i=bottom_r;i>=top_r;i--){
                    ans[i][left_c]=num++;
                }
            }
            left_c++;
        }
        return ans;
    }
}