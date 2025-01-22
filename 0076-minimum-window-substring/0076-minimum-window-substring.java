class Solution {
    public String minWindow(String s, String t) {
        int start = 0;
        int end = 0;
        int unique = 0;
        int startIndex = -1;
        // int endIndex = 0;
        int minLength = s.length()+1;
        int max = s.length();
        int[] freqS = new int[128];
        int[] freqT = new int[128];;
        for(char c : t.toCharArray()){
            if(freqT[c]++ == 0){
                ++unique;
            }
        }
        while(end<s.length()){
            char c= s.charAt(end);
            ++freqS[c];
            if(freqS[c] == freqT[c]){
                --unique;
            }
            while(unique == 0){
                if(end-start+1<minLength){
                    startIndex = start;
                    minLength = end-start+1;
                }
                char ch = s.charAt(start);
                if(freqS[ch] == freqT[ch]){
                    ++unique;
                }
                ++start;
                --freqS[ch];
            }
                // start++;
            ++end;
        }
        return startIndex == -1 ? "" : s.substring(startIndex,startIndex+minLength);
    }
}