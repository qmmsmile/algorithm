package com.qmm.chapter1;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author qinmengmei
 * @date 2018/10/23
 */
public class practicePart3 {


    /**
     * test1.3.4
     * @return
     */
    public static boolean test134(String arg){
        Stack<Character> stack = new Stack<Character>();
        for (int  i=0 ; i<arg.length() ; i++) {
            char s = arg.charAt(i);
            if (s == '(' || s=='[' || s=='{') {
                stack.push(s);
            }
            if (s==')') {
                if (stack.isEmpty()) return false;
                if (stack.pop()!='(') return false;
            }
            if (s==']') {
                if (stack.isEmpty()) return false;
                if (stack.pop()!='[') return false;
            }
            if (s=='}') {
                if (stack.isEmpty()) return false;
                if (stack.pop()!='{') return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * test1.3.9
     * @return
     */
    public static String test129(String s){
        Stack<String> optrStack = new Stack<String>();
        Stack<String> dataStack = new Stack<String>();
        for (int i=0 ; i<s.length() ; i++){
            if (isData(s.charAt(i))) dataStack.push(String.valueOf(s.charAt(i)));
            else if (isOptr(s.charAt(i))) optrStack.push(String.valueOf(s.charAt(i)));
            else {
                String b2 = dataStack.pop();
                String b1 = dataStack.pop();
                String optr = optrStack.pop();
                String a = "(" + b1 + optr + b2 + ")";
                dataStack.push(a);
            }
        }
        while (!optrStack.isEmpty()){
            String b2 = dataStack.pop();
            String b1 = dataStack.pop();
            String optr = optrStack.pop();
            String a = "(" + b1 + optr + b2 + ")";
            dataStack.push(a);
        }
        return dataStack.pop();
    }

    public static boolean isData(char c){
        return c >= '0' && c <= '9';
    }

    public static boolean isOptr(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    /**
     * test1.3.10
     * @param s
     */
    public static void test1310(String s){
        Stack<String> operatorStack = new Stack<String>();
        for (int i=0 ; i<s.length() ; i++) {
            String str = String.valueOf(s.charAt(i));
            if (str.equals("("))
                operatorStack.push(str);
            else if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                boolean isEmpty = operatorStack.isEmpty();
                boolean isLeftParen = false;
                boolean isLowerOperator = false;
                if (!isEmpty) {
                    String stackTop = operatorStack.peek();
                    isLeftParen = operatorStack.peek().equals("(");
                    if ((stackTop.equals("+") || stackTop.equals("-")) && (str.equals("*") || str.equals("/"))) {
                        isLowerOperator = true;
                    }
                }
                if (!(isEmpty || isLeftParen || isLowerOperator)) {
                    for (int j = 0; j < operatorStack.size(); j++) {
                        System.out.print(operatorStack.pop());
                    }
                }
                operatorStack.push(str);
            } else if (str.equals(")")) {
                String pop = operatorStack.pop();
                while (!pop.equals("(")) {
                    System.out.print(pop);
                    pop = operatorStack.pop();
                }
            } else {
                System.out.print(str);
            }
        }
        for (String str : operatorStack) {
            System.out.print(str);
        }
    }

    /**
     * test1.3.12
     * @param s
     * @param <T>
     * @return
     */
    public static <T> Stack<T> test1312(Stack<T> s){
        Iterator<T> iterator = s.iterator();
        Stack<T> temp = new Stack<T>();
        Stack<T> result = new Stack<T>();
        while (iterator.hasNext()){
            temp.push(iterator.next());
        }
        iterator = temp.iterator();
        while (iterator.hasNext()){
            result.push(iterator.next());
        }
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(test134("{[[](])}"));

//        System.out.println( test129("1+2)*3-4)*5-6)))"));

//        test1310("2*3/(2-1)+3*(4-1)");

//        Stack<String> s = new Stack<String>();
//        s.push("first");
//        s.push("second");
//        s.push("third");
//        Stack<String> a = test1312(s);
//        while (!a.isEmpty()){
//            System.out.println(a.pop());
//        }


    }
}
