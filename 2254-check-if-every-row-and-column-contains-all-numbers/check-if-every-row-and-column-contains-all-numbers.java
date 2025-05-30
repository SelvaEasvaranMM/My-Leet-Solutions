class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            Set<Integer> s1=new HashSet<>();
            Set<Integer> s2=new HashSet<>();
            for(int j=0;j<matrix[i].length;j++){
                s1.add(matrix[i][j]);
                s2.add(matrix[j][i]);
            }
            for(int num=1;num<=matrix.length;num++){
                if(!s1.contains(num) || !s2.contains(num)) return false;
            }
        }
        return true;
    }
}