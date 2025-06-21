class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=students.length;
        int diff=0;
        for(int i=0;i<n;i++){
            diff+=Math.abs(seats[i]-students[i]);
        }
        return diff;
    }
}