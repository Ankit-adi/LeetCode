class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int b[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                b[0]=map.get(res);
                b[1]=i;
            }
            map.put(nums[i],i);
        }
        return b;
        
        }
}    
        
