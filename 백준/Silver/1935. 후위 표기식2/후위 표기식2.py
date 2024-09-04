import sys
input = sys.stdin.readline

N = int(input().strip())
sik = input().strip()
tmp = [int(input().strip()) for _ in range(N)]
stack = []

mapping = {chr(i + 65): tmp[i] for i in range(N)}

for char in sik:
    if char in mapping:
        stack.append(mapping[char])
    else:
        x = stack.pop()
        y = stack.pop()
        res = 0
        if char == "+":
            res = x + y
        elif char == "-":
            res =  y-x
        elif char == "*":
            res = x * y
        elif char == "/":
            res =  y/x
        stack.append(res)

result = stack[-1]
print(f"{result:.2f}")
    


