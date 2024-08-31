import sys
input = sys.stdin.readline

gwa = [0] * (31)

for _ in range(28):
    x = int(input().strip())
    gwa[x] = 1

for i in range(1,len(gwa)):
    if gwa[i] == 0:
        print(i)