import sys
input = sys.stdin.readline

s = input().strip()
stack = []
for i in range(len(s)):
    if s[i] == ")":
        if stack and stack[-1] == "(":
            stack.pop()
        else:
            stack.append(")")
    else:
        stack.append("(")
print(len(stack))
    

    
    











