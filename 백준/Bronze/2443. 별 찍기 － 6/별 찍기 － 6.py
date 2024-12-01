import sys
input = sys.stdin.readline
N = int(input().strip())
i = 0
while N!=i:
    for _ in range(i):
        print(" ",end = "")
    for _ in range(N*2-1-i*2):
        print("*",end = "")

    if i != N-1:
        print()
    i += 1


        




