import sys

sys.setrecursionlimit(10**6)

t = 0
N = 0
input_arr = []
wax = []

def recur(i):
    global t, N, input_arr, wax
    
    if i == N:
        t = (t + 1) % 998244353
        return
    
    for j in range(N):
        if i == j or input_arr[i] == j or wax[j]:
            continue
        
        wax[j] = True
        recur(i + 1)
        wax[j] = False

N = int(sys.stdin.readline())
inputs = list(map(int, sys.stdin.readline().split()))

input_arr = [x - 1 for x in inputs]
wax = [False] * N

recur(0)

print(t)