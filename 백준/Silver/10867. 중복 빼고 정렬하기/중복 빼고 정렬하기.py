import sys
input = sys.stdin.readline

N = int(input().strip())

tmp = set(map(int, input().strip().split()))
tmp = sorted(tmp)
print(' '.join(map(str,tmp)))