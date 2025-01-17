class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0;
        int end = 0;
        int count = 0;
        int maxc = 0;
        while(end<customers.length){
            if(grumpy[end]!=0)
                count += customers[end];
            while(end-start>=minutes){
                if(grumpy[start]!=0){
                    count -= customers[start];
                }
                start++;
            }
            maxc = Math.max(maxc,count);
            end++;
        }
        for(int i = 0;i<customers.length;i++){
            if(grumpy[i]==0){
                maxc+=customers[i];
            }
        }
        return maxc;

    }
}