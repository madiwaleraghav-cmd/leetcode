class Solution {
    public int findKthPositive(int[] arr, int k) {
        

        int i=0;
        int num=1;

        while(i<arr.length){

            if(num==arr[i]){
                i++;
                num++;
                continue;
            }
            k--;
            if(k==0){
                return num;
            }
            num++;
        }
        return arr[arr.length-1]+k;
    }
}