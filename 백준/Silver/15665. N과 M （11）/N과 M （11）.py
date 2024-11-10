import sys
input = sys.stdin.readline

def main():
    N, M = map(int, input().strip().split())
    nums = list(map(int, input().strip().split()))
    nums = sorted(set(nums))  # 중복 제거 및 정렬
    
    sequence = []
    
    def backtrack(depth):
        if depth == M:
            print(' '.join(map(str, sequence)))
            return
        for num in nums:
            sequence.append(num)        # 숫자 추가
            backtrack(depth + 1)        # 재귀 호출
            sequence.pop()              # 숫자 제거 (백트래킹)
    
    backtrack(0)

if __name__ == "__main__":
    main()