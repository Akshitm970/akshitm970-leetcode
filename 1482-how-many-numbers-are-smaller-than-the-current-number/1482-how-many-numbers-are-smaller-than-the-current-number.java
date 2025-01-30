class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // int pointer = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                if(i != j && nums[j] < nums[i]){
                        count++;
                    }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}