import sys
input = sys.stdin.readline

def recur(lis):
    if len(lis) == M:
        if M == 1:
            print(lis[0])
        else:
            print(' '.join(map(str,lis)))
        return
    
    for i in range(len(li)):
        lis.append(li[i])
        recur(lis)
        lis.pop()


N,M = map(int, input().strip().split())
li = list(map(int, input().strip().split()))
li.sort()
recur([])
