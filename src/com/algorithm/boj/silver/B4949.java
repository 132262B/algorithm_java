package com.algorithm.boj.silver;

import java.util.Scanner;
import java.util.Stack;

/**
 * @see <a href="https://www.acmicpc.net/problem/4949"/> 문제주소 </a>
 * 백준 / 4949 / 균형잡힌 세상
 */
public class B4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals(".")) {
                break;
            }
            System.out.println(balance(str));
        }
        sc.close();
    }

    public static String balance(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }

        }

        if (stack.empty()) return "yes";
        else return "no";

    }
}
