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