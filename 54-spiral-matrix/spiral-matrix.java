class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<>();
        int top_r=0;
        int bottom_r=matrix.length-1;
        int left_c=0;
        int right_c=matrix[0].length-1;
        while(top_r<=bottom_r && left_c<=right_c){
            for(int i=left_c;i<=right_c;i++){
                ls.add(matrix[top_r][i]);
            }
            top_r++;
            for(int i=top_r;i<=bottom_r;i++){
                ls.add(matrix[i][right_c]);
            }
            right_c--;
            if(top_r<=bottom_r){
                for(int i=right_c;i>=left_c;i--){
                    ls.add(matrix[bottom_r][i]);
                }
            }
            bottom_r--;
            if(left_c<=right_c){
                for(int i=bottom_r;i>=top_r;i--){
                    ls.add(matrix[i][left_c]);
                }
            }
            left_c++;
        }
        return ls;
    }
}