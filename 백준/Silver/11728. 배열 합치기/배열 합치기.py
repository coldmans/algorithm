import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
A = sorted(list(map(int, input().strip().split())))
B = sorted(list(map(int, input().strip().split())))

i = 0
j = 0
tmp = []
while i < len(A) and j < len(B):
    if A[i] < B[j]:
        tmp.append(A[i])
        i += 1
    else:
        tmp.append(B[j])
        j += 1

while i < len(A):
    tmp.append(A[i])
    i += 1

while j < len(B):
    tmp.append(B[j])
    j += 1

print(' '.join(map(str,tmp)))
