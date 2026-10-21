class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        track={}
        for index,value in enumerate(nums):
            find_num=target-value
            if value in track.keys():
                return [track[value],index]
            else:
                track[find_num]=index
        return [-1,-1]

        