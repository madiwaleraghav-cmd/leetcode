class Solution {
    public boolean check(int[] nums) {
      
      int count=0;

      for(int i=1;i<nums.length;i++){

        if(i==nums.length-1 && nums[i]>nums[0]){
            count++;
        }

        if(nums[i]<nums[i-1]){
            count++;
        }

        if(count>1){
            return false;
        }
      }
     return true;  
    }
}