import sys
from collections import defaultdict
input = sys.stdin.readline

test = defaultdict(int)
ctt = 0
while 1:
    try:
        x = input().strip()
        if not x:
            break
        ctt += 1
        test[x] += 1

        
    except EOFError:
        break

for tree in sorted(test.keys()):
    percentage = (test[tree] / ctt) * 100
    print(f"{tree} {percentage:.4f}")