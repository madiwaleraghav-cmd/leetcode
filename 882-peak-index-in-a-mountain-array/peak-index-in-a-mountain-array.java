class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peek=0;
        int low=0;
        int high=arr.length-1;

        while(low<=high){


        
            int mid=low+(high-low)/2;

            if(mid==0){
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }else{
                    low=mid+1;
                }
                continue;
            }

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                peek=mid;
                break;
            }

            if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return peek;
    }
}