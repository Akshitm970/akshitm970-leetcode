class Solution {
    public int[] productExceptSelf(int[] nums) {
    int m = nums.length;
    int[] arr = new int[m];
    int[] arrR = new int[m];
    int[] arrL = new int[m];
    arrR[0] = 1;
    arrL[m-1] = 1;

    for(int i = 1;i<m;i++){
        arrR[i] = arrR[i-1]*nums[i-1];
    }
    for(int i = m-2;i>=0;i--){
        arrL[i] = arrL[i+1]*nums[i+1];
    }
    for(int i = 0;i<m;i++){
        arr[i] = arrL[i]*arrR[i];
    }
    return arr;
    }
}