class Solution {
    public int majorityElement(int[] nums) {

        if(nums.length==1){
        return nums[0];
       }

       
       Arrays.sort(nums);

       int count=1;
       int number=nums[0];
       int mcount=1;

       for(int i=1;i<nums.length;i++){
          
          if(nums[i]!=nums[i-1]){
            count=1;

          }else{
            count++;

            if(count>mcount){
                mcount=count;
                number=nums[i];
            }
          }
       }

       return number;
    }
}