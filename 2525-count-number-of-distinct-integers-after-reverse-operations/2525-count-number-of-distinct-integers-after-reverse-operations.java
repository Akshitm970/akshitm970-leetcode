class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            int m = reverse(nums[i]);
            hs.add(m);
        }
        int n = hs.size();
        return n;
    }
    public int reverse(int num){
        int a = num;
        int rem;
        int rev = 0;
        while(a>0){
            rem = a%10;
            rev = (rev*10) + rem;
           a =  a/10;
        }
        return rev;
    }
}
