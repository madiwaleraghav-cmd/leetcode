class Solution {
    public int singleNonDuplicate(int[] nums) {

        int i=0;
        int j=nums.length-1;


        while(i<=j){
             
            if(i==j){
                return nums[i];
            }
            int mid=i+(j-i)/2;

            if(mid==nums.length-1){
                if(nums[mid]!=nums[mid-1]){
                    return nums[mid];
                }
            }

            if(mid==0){
                if(nums[mid]!=nums[mid+1]){
                    return nums[mid];
                }
            }

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else{
                if(nums[mid]==nums[mid-1]){
                    int num=(mid-1)-i;

                    if(num%2!=0){
                        j=mid-1-1;
                    }else{
                        i=mid+1;
                    }
                }else{
                    int num=mid-i;
                    
                    if(num%2!=0){
                        j=mid-1;
                    }else{
                        i=mid+1+1;
                    }

                }
            }


        }

        return 0;
        
    }
}