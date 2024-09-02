import sys
input = sys.stdin.readline

n = int(input().strip())

for _ in range(n):
    gab = list(map(str,input().strip().split()))
    for i in range(len(gab)):
        print(gab[i][::-1], end = " ")
    print()


