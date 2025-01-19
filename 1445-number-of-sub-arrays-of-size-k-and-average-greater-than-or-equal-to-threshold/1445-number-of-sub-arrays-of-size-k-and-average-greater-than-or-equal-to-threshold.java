class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // k = 5;
        int start = 0;
        int end = k;
        int sum = 0;
        int count = 0;
        for(int i= 0;i<k;i++){
            sum += arr[i];
        }
        if(sum/k>=threshold){
            count++;
        }
        while(end<arr.length){
            sum+= arr[end];
            while(end-start+1>k){
                sum-=arr[start];
                start++;
            }
            if(sum/k>=threshold){
                count++;
            }
            end++;

        }
        return count;
    }
}