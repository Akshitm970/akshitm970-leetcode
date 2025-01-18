class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start = cardPoints.length-1;
        int end = k-1;
        int cnt = 0;
        int mcnt = 0;
        for(int i = 0;i<k;i++){
            cnt += cardPoints[i];
        }
        mcnt = cnt;
        while(end>=0){
            cnt = cnt-cardPoints[end];
            cnt = cnt+cardPoints[start];
            mcnt = Math.max(mcnt,cnt);
            end--;
            start--;
        }
        
        return mcnt;
    }
}