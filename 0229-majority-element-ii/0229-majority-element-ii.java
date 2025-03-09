class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            if(hm.containsKey(n)){
                int frq = hm.get(n);
                hm.put(n,frq+1);
            }else{
                hm.put(n,1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key)>nums.length/3){
                ls.add(key);
            }
        }
        return ls;
    }
}