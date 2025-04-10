class Solution {
    public int reverseDegree(String s) {
        int a = 0;
        int count = 1;
        for(int i = 0;i<s.length();i++){
            a += (26-((int)(s.charAt(i)-'a')))*count;
            count++;
        }
        return a;
    }
}