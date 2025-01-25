class Solution {
    public String reversePrefix(String word, char ch) {
        int j = 0;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                j = i;
                break;
            }
        }
        String s = "";
        // for(int i = j;i>0;i--)
        for(int i = j;i>=0;i--){
            s +=word.charAt(i);
        }
        for(int i = j+1;i<word.length();i++){
            s+= word.charAt(i);
        }
        return s;
    }
}