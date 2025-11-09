package Problems;

import java.util.*;
public class postfix{
    static int evaluater(String expression){
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }
            else{
                int one=stack.pop();
                int two=stack.pop();
 
               switch(c){
                    case '+':
                        stack.push(one+two);
                        break;
                        case '-':
                            stack.push(one-two);
                            break;
                            case '*':
                                stack.push(one*two);
                                break;
                                case '/':
                                    stack.push(one/two);
                                    break;
                }
                
            }
        }
        return stack.pop();
    }
        public static void main(String args[]){
            String expression = "231*+9-";  // Example postfix expression: 2 + (3 * 1) - 9
        int result = evaluater(expression);
        System.out.println("The result of the postfix expression is: " + result);
    }
}