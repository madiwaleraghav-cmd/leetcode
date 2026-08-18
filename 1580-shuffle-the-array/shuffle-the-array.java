class Solution {
    public int[] shuffle(int[] nums, int n) {
        

        if(nums.length==2){
            return nums;
        }
       int[] arr=new int[nums.length];

       int l=1;
       int j=n;;
       int k=0;
       
       arr[0]=nums[0];
       for(int i=1;i<arr.length;i++){
          if(i%2!=0){
            arr[i]=nums[j];
            j++;
          }else{
            arr[i]=nums[l];
            l++;
          }
       }

       return arr;
    }
}