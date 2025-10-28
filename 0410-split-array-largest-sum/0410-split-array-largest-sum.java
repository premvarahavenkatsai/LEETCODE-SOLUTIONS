class Solution {
    private int subarrays(int[] nums,int min){
        int sum=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>min){
                k++;
                sum=nums[i];
            }
        }
        return k;
    }
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum=0;
        for(int p:nums){
            max = Math.max(max,p);
            sum+=p;
        }
        int low = max;
        int high = sum;
        int ans = -1;
        while(low<=high){
            int mid =(low + high) / 2;
            if(subarrays(nums,mid) < k){
                ans = mid;
                high = mid - 1; 
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}