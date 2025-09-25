class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,map.getOrDefault(0,0)+1);
        int c=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int target = sum - k;
            if(map.containsKey(target)){
                c+=map.get(target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}