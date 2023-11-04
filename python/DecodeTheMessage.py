class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        s_table: dict = {}
        ascii: int = 97 # a
        decoded: str = ""

        # set up substitued table
        for i in range(0, len(key)):
            if key[i] not in s_table:
                if key[i] == " ":
                    s_table[key[i]] = " "
                else: 
                    s_table[key[i]] = chr(ascii)
                    ascii += 1

        # decode message
        for j in range(0, len(message)):
            decoded += s_table.get(message[j])
        
        return decoded

        
"""
set up substitued table
    adding each char of key into dict if not contains
    key: a ...
    space is just space

decode message:
    to use the dict, get each value with char (key)
"""
