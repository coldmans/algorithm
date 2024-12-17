import sys
input = sys.stdin.readline

n, k = map(int, input().strip().split())
li = list(map(int, input().strip().split()))

li.sort()
print(li[k-1])