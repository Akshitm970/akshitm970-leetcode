class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(int i = 0;i<details.length;i++){
            char n = details[i].charAt(11);
            char o = details[i].charAt(12);
            if(n>'6' || (n=='6' && o>'0')){
                count++;
            }
        }
        return count;
    }
}