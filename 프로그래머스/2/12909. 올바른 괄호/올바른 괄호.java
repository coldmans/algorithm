import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.add(0);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() != 0){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}