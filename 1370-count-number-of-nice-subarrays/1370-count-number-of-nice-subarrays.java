class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);

    }

    public int helper(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        while (end < nums.length) {
            if (nums[end] % 2 == 1) {
                k--;
                while (k < 0) {
                    if (nums[start] % 2 == 1) {
                        k++;
                    }
                    start++;
                }
            }
            count += end - start + 1;
            end++;
        }
        return count;
    }
}