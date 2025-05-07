class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0;

        int b = 0;
        for(int i = 0;i<s.length();i++){
            a+= s.charAt(i);
            
        }
        for(int i = 0;i<t.length();i++){
            b+= t.charAt(i);
        }
        b = b-a;

        char m = (char)(b);
        return m;
    }
}