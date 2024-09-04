import sys
input = sys.stdin.readline

n = input().strip()
tmp = [0] * 26
for i in n:
    tmp[ord(i) - ord('a')] += 1

print(' '.join(map(str,tmp)))   
