import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tmp = new Stack<>();
        for(int i = order.length - 1; i >= 0; i--){
            stack.add(order[i]);
        }
        for(int i = 1; i <= order.length; i++){
            while(!tmp.isEmpty() && tmp.peek().equals(stack.peek())){
                tmp.pop();
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() == i){
                stack.pop();
            }
            else{
                tmp.add(i);
            }
        }
        while(!tmp.isEmpty()){
            if(tmp.peek().equals(stack.peek())){
                tmp.pop();
                stack.pop();
            }
            else{
                break;
            }
        }
        return order.length - stack.size();
    }
}