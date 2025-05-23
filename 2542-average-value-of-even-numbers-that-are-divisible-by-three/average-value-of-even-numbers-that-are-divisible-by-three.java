    class Solution {
        public int averageValue(int[] nums) {
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0 && nums[i]%3==0) ls.add(nums[i]);
            }
            int c=0;
            int sum=0;
            for(int j:ls){
                sum+=j;
                c++;
            }
            if(c==0) return 0;
            return sum/c;
        }
    }