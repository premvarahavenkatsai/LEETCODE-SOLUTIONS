class Solution {
    private int fun(int[] piles,int k,int h){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total += (piles[i] + k - 1) / k;
            if(total > h) return total;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        int max = 0;
        for(int l:piles){
            max=Math.max(max,l);
        }
        int low = 1;
        int high = max;
        int ans = max;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int th=fun(piles,mid,h);
            if(th <= h){
                ans = mid;
                high  = mid - 1;
            }else{
                low  = mid + 1;
            }
        } 
        return ans;
    }
}