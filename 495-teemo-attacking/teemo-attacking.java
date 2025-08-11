class Solution {
    public int findPoisonedDuration(int[] time, int duration) {
        int c=0;
        for(int i=0;i<time.length-1;i++){
           c+=Math.min(duration,time[i+1]-time[i]);
        }
        if(time.length>0){
            c+=duration;
        }
        return c;
    }
}