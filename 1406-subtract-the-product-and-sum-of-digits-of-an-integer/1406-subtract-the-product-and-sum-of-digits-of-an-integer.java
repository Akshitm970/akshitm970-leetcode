class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        String s = Integer.toString(n);
        while(n>0){
            sum += n%10;
            prod *= n%10;
            n = n/10;
        }
        return prod - sum;
    }
}