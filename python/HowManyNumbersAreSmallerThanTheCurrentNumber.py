class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        nums_dict = {n: 0 for n in nums}
        print(nums_dict.get(8))

        return [] 
"""
{
    8: 0,
    1: 0,
    2: 0,
    2: 0,
    3: 0
}
This can't because of the key duplication case

list 
    sort
    [1,2,2,3,8]
     i
       j
"""
