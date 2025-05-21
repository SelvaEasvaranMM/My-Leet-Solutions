class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> ls1=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    List<Integer> ls2=new ArrayList<>();
                    ls2.add(i);
                    ls2.add(j);
                    ls1.add(ls2);
                }
            }
        }
        for(var n:ls1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][n.get(1)]=0;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[n.get(0)][j]=0;
            }
        }
    }
}