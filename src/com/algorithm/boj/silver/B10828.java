package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10828"/> 문제주소 </a>
 * 백준 / 10828 / 스택
 */
public class B10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push": {
                    stack.push(st.nextToken());
                    break;
                }
                case "pop": {
                    if (stack.size() == 0) sb.append("-1").append("\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                }
                case "size": {
                    sb.append(stack.size()).append("\n");
                    break;
                }
                case "empty": {
                    if (stack.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                }
                case "top": {
                    if (stack.size() == 0) sb.append("-1").append("\n");
                    else sb.append(stack.peek()).append("\n");
                    break;
                }
            }

        }

        System.out.println(sb);

    }
}
