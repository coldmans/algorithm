
class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }
        int move = n - 1;
        for(int i = 0; i < n; i++){
            int next = i + 1;
            while(next < n && name.charAt(next) == 'A'){
                next++;
            }
            move = Math.min(move, 2 * i + (n - next));
            move = Math.min(move, i + 2 * (n - next));
        }
        return answer+move;
    }
}