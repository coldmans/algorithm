import sys
input = sys.stdin.readline

stick = input().strip()

stack = []

ctt = 0

for i in range(len(stick)):
    if stick[i] == "(":
        if stick[i+1] == "(":
            stack.append(stick[i])
    elif stick[i] == ")":
        if stick[i-1] == "(":
            ctt += len(stack)
        else:
            ctt += 1
            stack.pop()
            
     
        
print(ctt)