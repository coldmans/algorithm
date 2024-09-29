import sys
input = sys.stdin.readline

n, m = map(int, input().strip().split())
tmp = []
for _ in range(n):
    sin, su = map(int,input().strip().split())
    mile = list(map(int, input().strip().split()))
    mile.sort()
    if su > sin:
        tmp.append(1)
    else:
        tmp.append(mile[sin -su])
        
        
tmp.sort()
res = 0
result = 0
for i in range(len(tmp)):
    res += tmp[i]
    if res > m:
        result = i
        break
    elif i == len(tmp)-1:
        result = i+1
        

print(result)    


