class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for(int i = 0;i<batteryPercentages.length;i++){
            if(batteryPercentages[i]>0){
                for(int j = i+1;j<batteryPercentages.length;j++){
                    batteryPercentages[j]--;
                }
                count++;
            }
            if(batteryPercentages[i]<=0){
                continue;
            }
        }
        return count;
    }
}