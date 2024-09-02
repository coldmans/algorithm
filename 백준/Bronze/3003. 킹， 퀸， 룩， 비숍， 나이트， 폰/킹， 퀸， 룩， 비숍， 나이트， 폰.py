import sys
input = sys.stdin.readline

chess = [1,1,2,2,2,8]

item = [int(x) for x in input().strip().split()]

for i in range(len(item)):
    print(chess[i]-item[i], end = " ")
    