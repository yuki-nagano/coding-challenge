class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        j_set = {j for j in jewels}
        count = 0

        for s in stones:
            if s in j_set:
                count+= 1
        return count

'''
    store in j_set
    loop through stones, check if the stone contains
    count+= 1
'''

# 2nd time - didn't consider set
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewels_list: dict = {}
        for j in range(len(jewels)):
            jewels_list = {jewels[j]: 0}

        for s in range(len(stones)):
            if jewels_list.get(stones[s]):
                jewels_list[s] = jewels_list.get(s) + 1

        return sum(jewels_list.values())

"""
    aA aAAbbbb
    a: 1
    A: 2
"""
