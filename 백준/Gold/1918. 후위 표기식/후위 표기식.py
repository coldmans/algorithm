import sys
input = sys.stdin.readline

n = input().strip()
stack = []
result = []
for i in range(len(n)):
    if n[i] == "+" or n[i] == "-":
        while(stack):
            if stack[-1] == "(":
                break
            result.append(stack.pop())
        stack.append(n[i])
    
    elif n[i] == "/" or n[i] == "*":
        while(stack):
            if stack[-1] == "(":
                break
            if stack[-1] == "-" or stack[-1] == "+":
                break
            result.append(stack.pop())
        stack.append(n[i])
    
    elif n[i] == "(":
        stack.append(n[i])
    
    elif n[i] == ")":
        while(stack):
            if stack[-1] == "(":
                stack.pop()
                break
            result.append(stack.pop())
    else:
        result.append(n[i])

while stack:
    result.append(stack.pop())

print(''.join(map(str,result)))
