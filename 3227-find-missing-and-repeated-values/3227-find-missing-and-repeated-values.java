class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[2];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(!hs.contains(grid[i][j])){
                    hs.add(grid[i][j]);
                }else{
                    arr[0] = grid[i][j];
                }
            }
        }
        int n = grid.length*grid[0].length;
        int sum = n*(n+1)/2;
        int local = 0;
        for(int m : hs){
            local+=m;
        }
        arr[1] = sum-local;
        return  arr;
    }
}