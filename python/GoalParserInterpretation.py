class Solution:
    """ accepted with Time 33ms, Memory 16.13MB """
    def interpret(self, command: str) -> str:
        if command == "G":
            return command
        result = command.replace("()", "o").replace("(al)", "al")
        return result

"""
command: str = "G()(al)"
    replace them
    (al): al
    (): o
Memo:
  This is slightly slower (Time 45ms)
  o = command.replace("()", "o")
  result = o.replace("(al)", "al")
"""
