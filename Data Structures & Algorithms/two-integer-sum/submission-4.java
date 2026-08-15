class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> track = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(track.containsKey(target-nums[i])){
            return new int[] {track.get(target-nums[i]),i};
        }
        track.put(nums[i],i);
       }
       return new int[] {-1,-1};
    }
}