class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[]=text.split(" ");
        List<String> ls=new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1].equals(first) && arr[i].equals(second)){
                ls.add(arr[i+1]);
            }
        }
        String res[]=new String[ls.size()];
        int ind=0;
        for(String i:ls) res[ind++]=i;
        return res;
    }
}