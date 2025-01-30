class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = 0;
        int start = 0;
        int end = -1;
        int zeroCount = 0;
        while(start<nums.length){
            if(nums[start] == 0){
                zeroCount++;
                start++;
            }else{
                start++;
            }
            while(zeroCount >k){
                end++;
                if(nums[end]==0){
                    zeroCount--;
                }
            }
            int size = start-end-1;
            len = Integer.max(len,size);
        }
            return len;
    }
}