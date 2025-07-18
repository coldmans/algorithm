# [Silver III] 돌림판 (Small) - 12739 

[문제 링크](https://www.acmicpc.net/problem/12739) 

### 성능 요약

메모리: 21880 KB, 시간: 256 ms

### 분류

구현, 시뮬레이션

### 제출 일자

2025년 7월 9일 21:45:12

### 문제 설명

<p>지훈이는 경품 이벤트를 진행하기 위해서 원형판이 N등분 되어 있고, 각 N등분된 곳에 빨간색 또는 초록색 또는 파란색이 색칠되어 있는 돌림판을 준비하였다. 이 이벤트의 룰은 간단하다. 이벤트 참가자들은 빨간색, 초록색, 파란색 중 하나의 색을 선택한다. 만약 돌림판을 돌렸을 때, 스피너가 있는 칸의 색깔과 선택한 색깔이 일치한 모든 사람에게 상품을 제공한다. 원형판은 N등분 되어 있기 때문에, N개의 부분 중에서 빨간색이 색칠된 것이 a개, 초록색이 색칠된 것이 b개, 파란색이 색칠된 것이 c개라면, 각각의 색이 걸릴 확률은 각각 a/N, b/N, c/N이 된다. 즉, 이론적으로 돌림판의 각 부분에 어떠한 색이 칠해졌는지 모른다면, 각각의 색이 걸릴 확률은 모두 동일할 것이다.</p>

<p>지훈이는 참가자들이 어떠한 색을 선택했는지 조사해 보았는데, 세가지 색 중에서 특정색을 유난히 많이 선택했음을 알게 되었다. 그래서 그 이유를 찾아봤더니, 어떤 사람이 돌림판을 발견하고, 돌림판에서 가장 많이 색칠된 색을 친분이 있는 몇몇 참가자에게 알려줬다는 사실이 드러났다! 그래서 지훈이는 돌림판의 색들을 모두 바꾸고자 한다. 지훈이가 돌림판의 색을 바꾸는 과정은 다음과 같다: (돌림판의 각 부분의 색은 동시에 바뀐다)</p>

<p>만약 P를 돌림판의 어떤 임의의 부분이라고 하자.</p>

<ol>
	<li>만약 P의 왼쪽 부분과 P의 오른쪽 부분과 P에 칠해진 색이 모두 같거나, 모두 다르다면, P에 칠해진 색을 파란색으로 바꾼다.</li>
	<li>그렇지 않다면, 1에서 고려했던 세 부분 중에서 X 색이 2개, Y 색이 1개 칠해진 상황일 것이다.</li>
	<li>다음 조건을 한 가지라도 만족한다면, P에 칠해진 색을 빨강색으로 바꾼다. 그렇지 않다면, 초록색으로 바꾼다.</li>
</ol>

<p>(X가 빨강색이고 Y가 초록색인 경우, X가 초록색이고 Y가 파랑색인 경우, X가 파랑색이고 Y가 빨강색인 경우)</p>

<p>지훈이는 이렇게 돌림판의 색을 1번 바꾸었다. 그래도 불안했던 지훈이는 같은 방법으로 색을 K-1번 더 바꾸었다. 그렇다면, 이제 돌림판에는 어떠한 색이 몇 개의 조각에 칠해졌는지 구하고 싶다. 지훈이를 도와 이 문제를 해결해주자.</p>

### 입력 

 <p>첫째 줄에 N과 K가 주어진다.</p>

<p>두 번째 줄에 길이가 N인 문자열이 주어지는데, 이는 돌림판의 각 구간에 칠해진 색을 시계방향으로 나타낸 것이다. (빨강색은 R, 초록색은 G, 파랑색은 B로 주어진다)</p>

<p>N, K의 제한은 다음과 같다.</p>

<p>1 ≤ N ≤ 1000, 1 ≤ K ≤ 1000</p>

### 출력 

 <p>빨강색으로 칠해진 구간의 수, 초록색으로 칠해진 구간의 수, 파랑색으로 칠해진 구간의 수를 차례대로 띄어쓰기로 구분해 출력한다.</p>

