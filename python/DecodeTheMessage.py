class Solution:
    def decodeMessage(self, key: str, message: str) -> str:

        # add space in advance not using if
        s_table = {" ": " "}
        ascii: int = 97 # a
        decoded: str = ""

        # set up substitued table
        for char in key:
            if char not in s_table:
                s_table[char] = chr(ascii)
                ascii += 1

        # decode message
        for char in message:
            decoded += s_table[char]
        
        return decoded

        
"""
Memo
    for char in key - instead of for i in range(len(keys))
set up substitued table
    adding each char of key into dict if not contains
    key: a ...
    space is just space

decode message:
    to use the dict, get each value with char (key)
"""
