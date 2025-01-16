class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int minlength = Integer.MAX_VALUE;
        int cost = 0;
        // int length = 0;
        while(end<nums.length){
            cost += nums[end];
            // length++;
            while(cost>=target){
                cost -= nums[start];
                // length--;
                start++;
                minlength = Math.min(minlength,end-start+1);
            }
            end++;
            // minlength = Math.min(minlength,end-start+1);
        }
                        // minlength = Math.min(minlength,length);

        return minlength == Integer.MAX_VALUE ? 0:minlength+1;
    }
}