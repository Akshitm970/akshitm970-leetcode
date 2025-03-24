class Solution {
    public int countPoints(String rings) {
int count = 0;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        for(int i = 0;i<rings.length();i+=2){
            int a = rings.charAt(i+1)-'0';
            if(rings.charAt(i)=='R'){
                arr1[a]++;
            }else if(rings.charAt(i)=='G'){
                arr2[a]++;
            }else if(rings.charAt(i)=='B'){
                arr3[a]++;
            }
        }
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]>0 && arr2[i]>0 && arr3[i]>0){
                count++;
            }
        }
        return count;
    }
}