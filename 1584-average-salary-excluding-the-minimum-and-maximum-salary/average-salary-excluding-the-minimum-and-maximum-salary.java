class Solution {
    public double average(int[] salary) {
        double min=Integer.MAX_VALUE;
        double max=Integer.MIN_VALUE;
        for(int i:salary){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        double sum=0;
        for(int i:salary){
            sum+=i;
        }
        sum=sum-(min+max);
        return (double)sum/(salary.length-2);
    }
}