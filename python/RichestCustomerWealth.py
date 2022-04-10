class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        cur_max = 0;
        for i in range(len(accounts)):
            sum = 0;
            for j in range(len(accounts[i])):
                sum += accounts[i][j]
            cur_max = max(sum, cur_max)

        return cur_max

'''
    sum all of them and Priorityqueue...
    update max every time
    cur_max = 0;
    for i in accounts:
        for j in accounts[i]:
            sum += account[i][j]
        cur_max = max(sum, cur_max)

    return cur_max

'''