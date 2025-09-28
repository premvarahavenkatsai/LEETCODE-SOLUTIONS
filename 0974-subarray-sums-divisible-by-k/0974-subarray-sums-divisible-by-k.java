class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,c=0;
        // if(n==1) return 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int mod=((sum % k) + k) % k;
            if(mod<0) mod+=k;
            System.out.println(mod);
            if(map.containsKey(mod)){
                c+=map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return c;
    }
}