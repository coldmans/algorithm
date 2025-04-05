import sys
input = sys.stdin.readline

a,b = map(int, input().strip().split())
lia = set(map(int, input().strip().split()))
lib = set(map(int, input().strip().split()))

tmp = lia - lib
tmp = list(tmp)
tmp.sort()
print(len(tmp))
if tmp:
    print(*tmp)