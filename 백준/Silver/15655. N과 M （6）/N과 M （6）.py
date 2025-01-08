import sys
input = sys.stdin.readline

def nmn(lis,x):
    if len(lis) == M:
        if M == 1:
            print(lis[0])
        else:
            print(' '.join(map(str,lis)))
    for i in range(x,len(li)):
        if lis and lis[-1] >= li[i]:
            continue
        lis.append(li[i])
        nmn(lis,x+1)
        lis.pop()


N,M = map(int, input().strip().split())
li = list(map(int, input().strip().split()))
li.sort()
nmn([],0)


    

    
        









