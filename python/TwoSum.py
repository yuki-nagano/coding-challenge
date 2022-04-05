class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # nums_dict = {nums[i] : i for i in range(len(nums))}
        nums_dict = {}
        for i in range(len(nums)):
            cur_num = target - nums[i];
            if cur_num in nums_dict.keys():
                return [i, nums_dict.get(cur_num)]
            else:
                nums_dict[nums[i]] = i;
        return [0,0]
