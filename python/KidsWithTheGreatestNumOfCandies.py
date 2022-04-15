class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []
        greatest = 0
        for c in candies:
            greatest = max(c, greatest) # O(n)

        for candy in candies:
            candy += extraCandies
            if greatest <= candy:
                result.append(True)
            else:
                result.append(False)

        return result

'''
True if the largest number of
candies array after adding extra

Ideas:
- check the largest number (linear)
- add extra and check, append bool
'''