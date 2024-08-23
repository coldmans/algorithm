import sys
input = sys.stdin.readline

n = 1000001

end = int(n **(1/2))
link = [i for i in range(n+1)]
link[1] = 0
for i in range(2,end+1):
    if link[i] == 0:
        continue
    for j in range(i*i, n+1, i):
        link[j] = 0
    

while 1:
    x = int(input().strip())
    if x == 0:
        sys.exit()
    for i in range(len(link)):
        if link[i] >= x:
            break
        if link[i] and link[x-i]:
            print(f'{x} = {link[i]} + {link[x-i]}')
            break
    else:
        print("Goldbach's conjecture is wrong.")

    