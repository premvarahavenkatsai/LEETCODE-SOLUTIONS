class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int f= target - nums[i];
            if(map.containsKey(f)){
                return new int[]{map.get(f),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}