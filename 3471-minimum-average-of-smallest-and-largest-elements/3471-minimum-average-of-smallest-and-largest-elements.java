class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        double localM = Double.MAX_VALUE;
        while(left<nums.length){
            double avg = nums[left]+nums[right];
             avg = avg/2;
            localM = Math.min(localM,avg);
            left++;
            right--;
        }
return localM;
    }
}