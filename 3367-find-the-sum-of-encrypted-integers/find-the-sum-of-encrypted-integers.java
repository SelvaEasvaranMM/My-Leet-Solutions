class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num:nums){
            char max='0';
            String s=String.valueOf(num);
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>max) max=c;
            }
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s.length();j++){
                sb.append(max);
            }
            sum+=Integer.parseInt(sb.toString());
        }
        return sum;
    }
}