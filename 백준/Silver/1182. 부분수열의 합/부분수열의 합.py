import sys
input = sys.stdin.readline

def backtrack(index, current_sum):
    global ctt
    if index == n:
        return
    if current_sum + arr[index] == s:
        ctt += 1
    backtrack(index + 1, current_sum)
    backtrack(index + 1, current_sum + arr[index])

n, s = map(int, input().strip().split())
arr = list(map(int, input().strip().split()))
ctt = 0

backtrack(0, 0)
print(ctt)