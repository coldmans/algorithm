import sys
input = sys.stdin.readline

while(1):
    s, age, kg = input().strip().split()
    if s == "#" and age == "0" and kg == "0":
        break
    if int(age) > 17 or int(kg) >= 80:
        print(s,end = " ")
        print("Senior")
    else:
        print(s, end = " ")
        print("Junior")
