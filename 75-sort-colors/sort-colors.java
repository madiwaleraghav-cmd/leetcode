class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int zero=map.get(0);
        int one=map.get(1);
        int two=map.get(2);

        for(int i=0;i<nums.length;i++){
            if(zero>0){
                nums[i]=0;
                zero--;
            }else if(one>0){
                nums[i]=1;
                one--;
            }else if(two>0){
                nums[i]=2;
                two--;
            }
        }
    }
}