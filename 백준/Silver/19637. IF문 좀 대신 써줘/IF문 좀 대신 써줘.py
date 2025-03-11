import sys
input = sys.stdin.readline

N,M = map(int, input().strip().split())
li = []
for _ in range(N):
    name, num = input().strip().split()
    li.append((name,int(num)))

for _ in range(M):
    i = 0
    j = len(li) -1
    num = int(input().strip())
    while i <= j:
        mid = (i + j) // 2
        if num <= li[mid][1]:
            j = mid - 1
        else:
            i = mid + 1
    print(li[i][0])











        



