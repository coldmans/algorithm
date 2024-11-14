import sys
input = sys.stdin.readline


N = int(input().strip())
tmp = []
dic = dict()
a = 0
x = 0
for _ in range(N):
    a = int(input().strip())
    x += a
    if a in dic:
        dic[a] += 1
    else:
        dic[a] = 1
    tmp.append(a)
print(round(x/N))
tmp.sort()
print(tmp[N//2])

maxi = 0
for i in dic.values():
    maxi = max(maxi, i)

tt = []
for i in dic.keys():
    if maxi == dic[i]:
        tt.append(i)
tt.sort()

if len(tt) == 1:
    print(tt[0])
else:
    print(tt[1])
print(max(tmp)-min(tmp))










   

    






    







    





