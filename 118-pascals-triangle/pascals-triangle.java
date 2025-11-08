class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows<=0) return res;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        res.add(row);
        for(int i=1;i<numRows;i++){
            List<Integer> nRow=new ArrayList<>();
            nRow.add(1);
            List<Integer> prev=res.get(i-1);
            for(int j=1;j<prev.size();j++){
                nRow.add(prev.get(j-1)+prev.get(j));
            }
            nRow.add(1);
            res.add(nRow);
        }
        return res;
    }
}