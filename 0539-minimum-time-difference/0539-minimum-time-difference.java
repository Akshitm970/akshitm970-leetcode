class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] arr = new int[timePoints.size()];
        int mini = Integer.MAX_VALUE;
        for(int i = 0;i<timePoints.size();i++){
            String s = timePoints.get(i);
            int a = 10*s.charAt(0);
            a+= s.charAt(1);
            a = 60*a;
            a+=10*s.charAt(3);
            a+=s.charAt(4);
            arr[i] = a;
        }
        Arrays.sort(arr);
        for(int i = 1;i<arr.length;i++){
            mini = Math.min(mini,arr[i]-arr[i-1]);
        }
        mini = Math.min(mini,1440-(arr[arr.length-1]-arr[0]));
        return mini;
    }
}