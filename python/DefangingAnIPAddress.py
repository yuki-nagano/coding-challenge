class Solution:
    def defangIPaddr(self, address: str) -> str:
        result = ""
        for i in range(len(address)):
            if address[i] == '.':
                result += '[' + address[i] + ']'
            else:
                result += address[i]
        return result