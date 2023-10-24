class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sorted: list = nums.copy()
        sorted.sort()
        smaller_numbers: dict = {}
        result: list = []
        i = 0
        for n in sorted:
            print("n ", n)
            print("smaller_numbers.get ", smaller_numbers.get(n))
            if not smaller_numbers.get(n):
                smaller_numbers[n] = i
                print("dict ", smaller_numbers)
            i += 1
        
        for n in nums:
            result.append(smaller_numbers.get(n))

        return result

"""
    1. sort
    2. get the number of how many before self
    3. put them into a map

    [6,5,4,8] -> [4,5,6,8]
    {
        6: 2
        5: 1
        4: 0,
        8: 3
    }
"""
