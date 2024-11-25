import sys
input = sys.stdin.readline

N, O = map(str, input().strip().split())
N = int(N)
li = set()
for _ in range(N):
    li.add(input().strip())

if O == 'Y':
    print(len(li))
elif O == 'F':
    print(len(li)//2)
else:
    print(len(li) // 3)





