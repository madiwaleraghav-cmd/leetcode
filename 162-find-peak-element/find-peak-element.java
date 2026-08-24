class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length==1){
            return 0;
        }
         int peek=0;
        int low=0;
        int high=nums.length-1;

        while(low<=high){


        
            int mid=low+(high-low)/2;

            if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }else{
                    low=mid+1;
                }
                continue;
            }

            if(mid==nums.length-1){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }else{
                    high=mid-1;
                }
                continue;
            }

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                peek=mid;
                break;
            }

            if(nums[mid]<nums[mid-1] && nums[mid]>nums[mid+1]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return peek;
    }
}