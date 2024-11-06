import sys
input = sys.stdin.readline
N = int(input().strip())
tmp = []
for _ in range(N):
    t,time = map(str, input().strip().split())
    tmp.append((t,time))
ascore = 0
bscore = 0
atime = 0
btime = 0
if tmp[0][0] == '1':
    ascore += 1
else:
    bscore += 1
for i in range(1,N):
    if tmp[i][0] == '1':
        ascore += 1
        si, bun= map(int,tmp[i][1].split(":"))
        bun += si * 60
        zi, zbun = map(int, tmp[i-1][1].split(":"))
        zbun += zi * 60
        bun -= zbun
        if ascore <= bscore:
            btime += bun
        elif ascore -1 > bscore:
            atime += bun
        
    elif tmp[i][0] == '2':
        bscore += 1
        si, bun= map(int,tmp[i][1].split(":"))
        bun += si * 60
        zi, zbun = map(int, tmp[i-1][1].split(":"))
        zbun += zi * 60
        bun -= zbun
        if ascore >= bscore:
            atime += bun
        elif bscore -1 > ascore:
            btime += bun
        
bun,cho = map(int, tmp[-1][1].split(":"))
cho += bun * 60
tmp = 48 * 60 - cho
if ascore > bscore:
    atime += tmp
elif bscore > ascore:
    btime += tmp

abun = atime // 60
acho = atime - abun * 60

bbun = btime // 60
bcho = btime - bbun * 60

print(f"{abun:02}:{acho:02}")
print(f"{bbun:02}:{bcho:02}")
    
    











