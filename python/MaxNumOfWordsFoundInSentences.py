class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        max_words = 0
        for s in sentences:
            count = 1
            for i in range(len(s)):
                if s[i] == ' ':
                    count += 1
            max_words = max(count, max_words)
        return max_words



    def mostWordsFound_sol_1(self, sentences: List[str]) -> int:
        max_words = 0
        for s in sentences:
            list = s.split(" ")
            max_words = max(len(list), max_words)
        return max_words



'''
- split the word and check the size if it's max
    for s in sents:
        list = s.split(" ")
        max_word = max(len(list), max)
        
    Time: O(n)
    Space: O(n)
    
- count the number of spaces and check the size if it's max
    for i
        for j
            if sents[i][j] is space
                count++
    Time: O(n^2)
    Space: O(1)
            

'''