class Solution {
    public int[] evenOddBit(int n) {
        List<Integer> ls=new ArrayList<>();
        String s=Integer.toBinaryString(n);
        for(int i=s.length()-1;i>=0;i--){
            ls.add(s.charAt(i)-'0');
        }
        int ans[]=new int[2];
        int even=0;
        int odd=0;
        for(int i=0;i<ls.size();i++)
        {
            if(i%2==0){
                if(ls.get(i)==1) even++;
            }
            else if(i%2!=0){
                if(ls.get(i)==1) odd++;
            }
        }
        ans[0]=even;
        ans[1]=odd;
        return ans;
    }
}