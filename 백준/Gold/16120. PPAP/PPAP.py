import sys

def main():
    li = sys.stdin.readline().rstrip()  # rstrip()은 뒤 공백,\n 제거

    # 파이썬에서 리스트 슬라이싱은 매번 새로운 리스트를 만드므로 비용이 큽니다.
    # 따라서 스택을 미리 문자열 길이만큼 할당해 두고, top 인덱스를 옮기는 방법으로 최적화할 수 있습니다.

    stack = [None] * len(li)  # 미리 리스트 할당
    top = 0  # 스택의 현재 위치 (0부터 시작)

    for char in li:
        stack[top] = char
        top += 1

        # top이 4 이상이고, 최근 4글자가 "PPAP"인지 확인
        if top >= 4:
            if (stack[top-4] == 'P' and
                stack[top-3] == 'P' and
                stack[top-2] == 'A' and
                stack[top-1] == 'P'):
                # PPAP를 P로 치환
                top -= 4  # 4글자 제거
                stack[top] = 'P'  # 마지막 위치에 'P'를 추가
                top += 1

    # 모든 처리가 끝난 뒤, 스택에 남아있는 길이가 1이고, 그 값이 'P'이면 PPAP 가능
    if top == 1 and stack[0] == 'P':
        print("PPAP")
    else:
        print("NP")

if __name__ == "__main__":
    main()