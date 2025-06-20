class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[101];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        Arrays.sort(freq);
        int count = 0;
        int goal = freq[100];
        for (int check : freq) {
            if (goal == check) {
                count++;
            }
        }
        return count * goal;
    }
}