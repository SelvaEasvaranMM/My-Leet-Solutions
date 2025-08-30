class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            int c=0;
            while(temp!=0){
                int k=temp%10;
                if(k==0) break;
                if(i%k==0) c++;
                temp/=10;
            }
            if(c==String.valueOf(i).length()) ls.add(i);
        }
        return ls;
    }
}