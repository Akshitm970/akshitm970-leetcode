class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for(int i = 0;i<indices.length;i++){
            int pos = indices[i];
            arr[pos] = s.charAt(i);
        }
        // String st = "";
        // for(int i = 0;i<arr.length;i++){
        //     st = st+arr[i];
        // }
        // return st;
        return new String(arr);
    }
}