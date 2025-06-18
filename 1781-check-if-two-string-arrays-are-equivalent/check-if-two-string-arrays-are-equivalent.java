class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> ls1=new ArrayList<>();
        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word1[i].length();j++){
                ls1.add(word1[i].charAt(j));
            }
        }
        List<Character> ls2=new ArrayList<>();
        for(int i=0;i<word2.length;i++){
            for(int j=0;j<word2[i].length();j++){
                ls2.add(word2[i].charAt(j));
            }
        }
        String s1="";
        String s2="";
        for(char c:ls1){
            s1+=c;
        }
        for(char c:ls2){
            s2+=c;
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)) return true;
        return false;
    }
}