import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static StringTokenizer st;

    static class Node {
        int val;
        Node left, right;

        public Node(int val){
            this.val = val;
        }
    }
    static int index = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> preorder = new ArrayList<>();
        while(true){
            String t = br.readLine();
            if(t == null || t.equals("-1")){
                break;
            }
            int ts = Integer.parseInt(t);
            preorder.add(ts);
        }

        int []arr = new int[preorder.size()];
        for(int i = 0; i < preorder.size(); i++){
            arr[i] = preorder.get(i);
        }

        Node root = buildBST(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
        postOrder(root);

    }

    static Node buildBST(int []preorder, int min, int max){
        if(index >= preorder.length) return null;
        int val = preorder[index];
        if(val < min || val > max) return null;
        index ++;
        Node root = new Node(val);
        root.left = buildBST(preorder, min, val);
        root.right = buildBST(preorder, val, max);
        return root;
    }

    static void postOrder(Node node){
        if(node == null) return;
        if(node.left != null){
            postOrder(node.left);
        }
        if(node.right != null){
            postOrder(node.right);
        }
        System.out.println(node.val);
    }
}

