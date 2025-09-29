class Solution {
    public int search(int[] nums, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        int l = 0;
        int n = nums.length;
        int r = n-1;
        int found = -1;
        while(l<=r){
            int mid=(l + r)/2;
            if(target == nums[mid]){
                return map.get(nums[mid]);
            }
            else if(target > nums[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}