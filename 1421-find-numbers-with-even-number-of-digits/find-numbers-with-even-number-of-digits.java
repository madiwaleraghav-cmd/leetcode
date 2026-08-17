class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;

        for(int i=0;i<nums.length;i++){

            int num=nums[i];
            int mod=10;
            int zero=1;

            while(num%mod!=num){
              zero++;
              mod=mod*10;
            }

            if(zero%2==0){
                count++;
            }
        }
        return count;
    }
}