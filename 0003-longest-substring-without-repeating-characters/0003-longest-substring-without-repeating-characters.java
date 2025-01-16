class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int start = 0;
        int end = 0;
        int length = 0;
        while(end<s.length()){
            int var = s.charAt(end);
            arr[var]++;
            // length++;
            while(arr[var]>1){
                int d = s.charAt(start);
                arr[d]--;
                start++;
                // length--;
            }
            length = Math.max(length,end-start+1);
            end++;
        }
        return length;
    }
}