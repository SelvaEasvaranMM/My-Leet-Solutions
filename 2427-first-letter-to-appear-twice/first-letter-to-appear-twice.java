class Solution {
    public char repeatedCharacter(String s) {
        List<Character> ls=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(!ls.contains(ch)) ls.add(ch);
            else return ch;
        }
        return ' ';
    }
}