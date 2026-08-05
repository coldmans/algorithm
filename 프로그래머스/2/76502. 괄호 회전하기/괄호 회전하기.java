import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean isNo = false;
        Stack<Character> stack = new Stack<>();
        for(int k = 0; k < s.length(); k++){
            
            
            boolean isOk = true;
            for(int i = k; i < s.length() + k; i++){
                int tt = i;
                if(i >= s.length()){
                    i -= s.length();
                }
                

                if(s.charAt(i) == '('){
                    stack.add('(');
                }
                else if(s.charAt(i) == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        isOk = false;
                        i = tt;
                        break;
                    }
                }
                else if(s.charAt(i) == '['){
                    stack.add('[');
                }
                else if(s.charAt(i) == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        isOk = false;
                        i = tt;
                        break;
                    }
                }

                else if(s.charAt(i) == '{'){
                    stack.add('{');
                }
                else if(s.charAt(i) == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        isOk = false;
                        i = tt;
                        break;
                    }
                }
                i = tt;
            }
            if(isOk && stack.isEmpty()){
                answer ++;
            }
            stack.clear();
        }
        return answer;
    }
}