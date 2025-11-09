import java.util.*;
class roman {
    public static int value(char c){
                switch(c){
                    case 'I':
                    return 1;
                    
                    case 'V':
                    return 5;
           
                    case 'X':
                    return 10;
                  
                    case 'L':
                    return 50;
                    
                    case 'C':
                    return 100;
                  
                    case 'D':
                    return 500;
    
                    case 'M':
                    return 1000;
    
                }
                return -1;
            }
        public static void romanToInt(String s) {
            Stack<Character> stack=new Stack<>();
            int valuee=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                stack.push(c);
                }
                while(!stack.isEmpty()){

                
                int a=value(stack.pop());
                if(stack.isEmpty()){
                    System.out.println(valuee+a);
                    return;
                }
                if(a>value(stack.peek())){
                valuee+=a-value(stack.pop());
                }
                else {
                    valuee+=a;
                }
            }
            System.out.println(valuee);
    
        }
        public static void main(String[] args) {
            String l="IV";
            romanToInt(l);

            
        }
    }