import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static class Node{
        int val;
        Node left, right, parent;
        public Node(int val){
            this.val = val;
        }
    }

    static int res = 0;
    static int wax = 0;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Node> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= N; i++){
            set.add(i);
        }
        for(int i = 1; i <= N; i++){
            list.add(new Node(i));
        }
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(b != -1) {
                list.get(a - 1).left = list.get(b - 1);
                list.get(b - 1).parent = list.get(a - 1);
                set.remove(b);
            }
            if(c != -1) {
                list.get(a - 1).right = list.get(c - 1);
                list.get(c - 1).parent = list.get(a - 1);
                set.remove(c);
            }
        }
        int t = (int) set.toArray()[0];
        Node root = list.get(t-1);
        Node temp = root;
        joong(temp);

        boolean []visited = new boolean[N+1];
        Node current = root;

        while(true){
            res ++;
            if(current.left != null && !visited[current.left.val]){
                current = current.left;
            }
            else if(current.right != null && !visited[current.right.val]){
                current = current.right;
            }
            else{
                visited[current.val] = true;
                if(current.val == wax) break;
                current = current.parent;
            }
        }
        System.out.println(res-1);
    }

    static void joong(Node node){
        if(node == null) return;
        joong(node.left);
        wax = node.val;
        joong(node.right);
    }

}

