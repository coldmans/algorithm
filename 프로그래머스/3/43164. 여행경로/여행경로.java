import java.util.*;

class Solution {
    boolean[] used; 
    String[] answer;

    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a, b) -> (a[0] + a[1]).compareTo(b[0] + b[1]));
        
        used = new boolean[tickets.length];
        List<String> path = new ArrayList<>();
        path.add("ICN");

        dfs("ICN", tickets, path);
        return answer;
    }

    private boolean dfs(String now, String[][] tickets, List<String> path) {
        if (path.size() == tickets.length + 1) {
            answer = path.toArray(new String[0]);
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!used[i] && tickets[i][0].equals(now)) {
                used[i] = true;
                path.add(tickets[i][1]);

                if (dfs(tickets[i][1], tickets, path)) return true; 

                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
        return false;
    }
}