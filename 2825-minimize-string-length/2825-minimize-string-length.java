class Solution {
    public int minimizedStringLength(String s) {
        int count =0;
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            int a = (int)(s.charAt(i)-'a');
            arr[a] = 1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}