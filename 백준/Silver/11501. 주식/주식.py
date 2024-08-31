import sys
input = sys.stdin.readline

test = int(input().strip())
for _ in range(test):
    day = int(input().strip())
    stock = list(map(int,input().strip().split()))
    tmp = stock[-1]
    res = 0
    for i in range(len(stock)-2,-1,-1):
        if stock[i] < tmp:
            res += tmp- stock[i]
        else:
            tmp = stock[i]
    print(res)