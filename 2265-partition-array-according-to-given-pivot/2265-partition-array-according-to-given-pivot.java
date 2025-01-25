class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int pos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[pos] = nums[i];
                pos++;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==pivot){
                arr[pos] = nums[i];
                pos++;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[pos] = nums[i];
                pos++;
            }
        }
        return arr;
    }
}