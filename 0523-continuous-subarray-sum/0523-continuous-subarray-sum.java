class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int prefix = sum % k;
            if(map.containsKey(prefix)){
                int len = i - map.get(prefix);
                if(len >= 2) return true;
            }
            map.put(prefix,i);
        }
        return false;
    }
}