class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }
        /*for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(x==words[i].charAt(j)){
                    list.add(i);
                    break;
                }
            }
        }*/
        return list;
    }
}