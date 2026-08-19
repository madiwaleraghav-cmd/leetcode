class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
       HashSet<Integer> set=new HashSet<>();

        while(i<nums1.length && j<nums2.length){
             
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
                continue;
            }

            if(nums1[i]>nums2[j]){
                j++;

            }
            else{
                i++;
            }
        }


        int[] inter=new int[set.size()];
        int k=0;

        for(int a:set){
            inter[k]=a;
            k++;
        }
      return inter; 
    }
}