class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        HashMap<Integer,Integer> track = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if(!track.containsKey(nums[i])){
                track.put( temp,i);
            }else{
                return new int[]{track.get(nums[i]),i};
            }

        }
        

        return new int[]{-1, -1};
    }
}