package com.algorithm.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2493"/> 문제주소 </a>
 * 백준 / 2493 / 탑
 */
public class B2493 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrs = new int[n + 1];
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            while (!stack.isEmpty()) {
                if (arr[stack.peek()] >= arr[i]) {
                    arrs[i] = stack.peek();
                    break;
                } else stack.pop();
            }

            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(arrs[i]).append(" ");
        }

        System.out.println(sb);

    }
}
