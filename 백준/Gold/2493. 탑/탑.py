import sys
input = sys.stdin.readline

n = int(input().strip())
t = list(map(int, input().strip().split()))
wax = [0] * n
stack = []

for i in range(n):
    while stack and t[stack[-1]] < t[i]:
        stack.pop()
    if stack:
        wax[i] = stack[-1] + 1
    stack.append(i)

print(" ".join(map(str, wax)))