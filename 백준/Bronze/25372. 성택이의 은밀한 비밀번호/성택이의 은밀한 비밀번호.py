import sys
input = sys.stdin.readline

n = int(input().strip())
for _ in range(n):
    x = input().strip()
    if 6 <= len(x) <= 9:
        print("yes")
    else:
        print("no") 