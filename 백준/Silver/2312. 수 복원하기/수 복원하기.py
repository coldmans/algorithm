import sys
input = sys.stdin.readline

def insu(n,li):
    if n == 1:
        for i in range(len(li)):
            if li[i] != 0:
                print(i, end = " ")
                print(li[i])
        return 

    for i in range(2,n+1):
        if n % i == 0:
            li[i] += 1
            insu(n//i, li)
            return
    

N = int(input().strip())
for _ in range(N):
    s = int(input().strip())
    if s == 1:
        print("1 1")
    else:
        insu(s,[0 for _ in range(s+1)])



