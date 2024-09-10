import sys
input = sys.stdin.readline

N, L = map(int, input().strip().split())

tape = [int(x) for x in input().strip().split()]

tape.sort()
ctt = 1
tmp = tape[0] + L
for i in tape:
    if i == tape[0]:
        continue
    if tmp > i:
        continue
    else:
        ctt += 1
        tmp = i + L

print(ctt)



        


    