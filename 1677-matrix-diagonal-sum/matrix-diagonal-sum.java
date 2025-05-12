class Solution {
    public int diagonalSum(int[][] mat) {
        int sd=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j||i+j==mat.length-1){
                    sd+=mat[i][j];
                }
            }
        }
        return sd;
    }
}