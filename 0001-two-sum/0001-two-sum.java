class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[1]=i;
                res[0]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
        
    }
}