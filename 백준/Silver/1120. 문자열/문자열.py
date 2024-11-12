import sys
input = sys.stdin.readline
res = 1e9
A,B = map(str,input().strip().split())
for i in range(len(B)-len(A)+1):
    tmp = 0
    for j in range(len(A)):
        if A[j] != B[i+j]:
            tmp += 1 
    res = min(tmp,res)
print(res)





    







    





