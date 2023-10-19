class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        good_employees: int = 0
        for n in hours:
            if n >= target:
                print(n)
                good_employees += 1
        return good_employees

"""
    Find the numbers that is greater than target
    - not sorted
    - no negative numbers
    hours = [0,1,2,3,4], target = 2
     
    (1) Time O(n), Space O(1)
     i
    [0,1,2,3,4]
    good_employees++ 
"""
