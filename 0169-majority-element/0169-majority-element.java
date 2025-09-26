class Solution {
    public int majorityElement(int[] nums){
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int l:nums){
            map.put(l,map.getOrDefault(l,0)+1);
        }
        int max=0;
        int majority=0;
        for(var entry:map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                majority = entry.getKey();
            }
            System.out.println(entry.getKey()+":"+entry.getValue()+" ");
        }
        return majority;
    }
}