class Solution {
    private boolean possible(int[] bloomDay,int m,int k,int p){
        int n=bloomDay.length;
        int c=0,b=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=p){
                c++;
                if(c==k){
                    b++;
                    c=0;
                }
            }else{
                c=0;
            }
        }
        if(b>=m){
            return true;
        }else{
            return false;
        }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int e:bloomDay){
            min=Math.min(min,e);
            max=Math.max(max,e);
        }
        int low = min;
        int high = max;
        int ans = -1;
        while(low<=high){
            int mid =(low+high)/2;
            if(possible(bloomDay,m,k,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}