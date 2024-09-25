import sys
input = sys.stdin.readline

N, X , K = map(int, input().strip().split())
for _ in range(K):
    a,b = map(int, input().strip().split())
    if a == X:
        X = b
    elif b == X:
        X = a
print(X)