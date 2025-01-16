class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int start = 0;
        int end = 0;
        int length = 0;
        while(end<s.length()){
            // int var = s.charAt(end);
            arr[(int)(s.charAt(end))]++;
            while(arr[(int)(s.charAt(end))]>1){
                // int d = s.charAt(start);
                arr[(int)(s.charAt(start))]--;
                start++;
            }
            length = Math.max(length,end-start+1);
            end++;
        }
        return length;
    }
}