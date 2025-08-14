class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length();i++){
            for(int j=i;j<num.length();j++){
                String temp=num.substring(i,j+1);
                if(temp.length()==3){
                    if(temp.charAt(0)==temp.charAt(1) 
                    && temp.charAt(1)==temp.charAt(2)){
                        if(max<Integer.parseInt(temp)){
                            res=temp;
                            max=Integer.parseInt(temp);
                        }
                    }
                }
            }
        }
        return res;
    }
}