class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] nums = new int[1001];
        for (int[] n : nums1) {
            nums[n[0]] += n[1];
        }
        for (int[] n : nums2) {
            nums[n[0]] += n[1];
        }
        int count = 0;
        for (int n : nums) {
            if (n != 0) count++;
        }
        int[][] res = new int[count][2];
        int j = 0;
        for (int i = 0; i <= 1000; i++) {
            if (nums[i] != 0) {
                res[j][0] = i;
                res[j][1] = nums[i];
                j++;
            }
        }
        
        return res;
    }
}