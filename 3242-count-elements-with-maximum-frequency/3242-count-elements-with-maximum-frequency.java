class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        int[] arr = new int[101];
        for(int i = 0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            max = Integer.max(max,arr[i]);
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                count += arr[i];
            }
        }
        return count;
    }
}