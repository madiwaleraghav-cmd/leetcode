class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
    
        int number=0,mr=0;

        for(int i=0;i<nums.length;i++){

        map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        if(map.get(nums[i])>=(nums.length/2)+1){
            return nums[i];
        }

        if(map.get(nums[i])>mr){
            mr=map.get(nums[i]);

            number=nums[i];
        }
        }

        return number;
    }
}