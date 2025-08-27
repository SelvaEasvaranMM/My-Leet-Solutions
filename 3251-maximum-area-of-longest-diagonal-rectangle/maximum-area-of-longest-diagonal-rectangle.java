class Solution {
    public int areaOfMaxDiagonal(int[][] dimen) {
        int maxdg=-1;
        int maxarea=-1;
        for(int i=0;i<dimen.length;i++){
            int l=dimen[i][0];
            int w=dimen[i][1];
            int dg=l*l+w*w;
            int area=l*w;
            if(dg>maxdg||(maxdg==dg && area>maxarea)){
                maxdg=dg;
                maxarea=area;
            }
        }
        return maxarea;
    }
}