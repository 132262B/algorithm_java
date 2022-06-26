package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://www.acmicpc.net/problem/1158"/> 문제주소 </a>
 * BOJ / 1158 / 요세푸스 문제
 */
public class B1158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        StringBuffer sb = new StringBuffer();
        sb.append("<");

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 1;
        while (queue.size() != 0) {

            if (count == k) {
                sb.append(queue.peek());
                queue.poll();
                count = 1;
                if (queue.size() != 0) sb.append(", ");

            } else {
                queue.add(queue.peek());
                queue.poll();
                count++;
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}
