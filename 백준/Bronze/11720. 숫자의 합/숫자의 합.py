import sys
input = sys.stdin.readline

N = int(input().strip())
num = input().strip()

res = 0
for i in num:
    res += int(i)

print(res)