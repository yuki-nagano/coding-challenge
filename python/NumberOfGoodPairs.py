class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        good_pairs = 0
        for i in range(len(nums) -1):
            for j in range(len(nums) -1):
                if not i == j:
                    if nums[i] == nums[j] and i < j:
                        good_pairs += 1
                    
        return good_pairs

"""
[1,2,3,1,1,3]
 i
   j
 """

# 2nd time with hint and discussion 
class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        n_dict = {}

        for n in nums:
            if n in n_dict:
                n_dict[n] = n_dict.get(n) + 1
            else:
                n_dict[n] = 1
        
        pairs = 0
        for n in n_dict.values():
            pairs += n * (n - 1) // 2

        return pairs
