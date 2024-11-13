import sys
input = sys.stdin.readline

mem = []
N = int(input().strip())
dasom = int(input().strip())
if N == 1:
    print(0)
    sys.exit()
tmp = dasom
for _ in range(N-1):
    mem.append(int(input().strip()))

while max(mem) >= dasom:
    indes = mem.index(max(mem))
    mem[indes] -= 1
    dasom += 1

print(dasom - tmp)

    






    







    





