class Solution {
    public long coloredCells(int n) {
        long r = 1 + 4L*n*(n-1)/2;
        return  r;
    }
}