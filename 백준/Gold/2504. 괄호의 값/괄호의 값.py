import sys
input = sys.stdin.readline

munja = input().strip()

stack = []

for i in range(len(munja)):
    if munja[i] == "(" or munja[i] == "[":
        stack.append(munja[i])
    elif munja[i] == ")":
        if not stack:
            print(0)
            sys.exit()
        tmp = stack.pop()
        if tmp == "(":
            stack.append(2)
        elif tmp == "[":
            print(0)
            sys.exit()
        else:
            res = int(tmp)
            while stack and stack[-1] != "(":
                if stack[-1] == "[":
                    print(0)
                    sys.exit()
                res += stack.pop()
            if stack:
                stack.pop()
                stack.append(res * 2)
            else:
                print(0)
                sys.exit()
    elif munja[i] == "]":
        if not stack:
            print(0)
            sys.exit()
        tmp = stack.pop()
        if tmp == "[":
            stack.append(3)
        elif tmp == "(":
            print(0)
            sys.exit()
        else:
            res = int(tmp)
            while stack and stack[-1] != "[":
                if stack[-1] == "(":
                    print(0)
                    sys.exit()      
                res += stack.pop()
            if stack:
                stack.pop()
                stack.append(res * 3)
            else:
                print(0)
                sys.exit()
for i in stack:
    if i == "(" or i == "[":
        print(0)
        sys.exit()

print(sum(stack))









