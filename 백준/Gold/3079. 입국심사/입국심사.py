import sys
input = sys.stdin.readline

def count_processed(t, times):
    total = 0
    for T in times:
        total += t // T
    return total

N, M = map(int, input().strip().split())
li = []
for i in range(N):
    t = int(input().strip())
    li.append(t)
li.sort()
j = li[0] * M
i = 1

while i < j:
    tmp = (i+j) // 2
    if count_processed(tmp,li) >= M:
        j = tmp
    else:
        i = tmp + 1

print(j)





   


    








    



