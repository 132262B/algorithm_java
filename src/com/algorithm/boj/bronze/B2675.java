package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2675"/> 문제주소 </a>
 * BOJ / 2675 / 문자열 반복
 */
public class B2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            String s = str[1];

            for (int j = 0; j < s.length(); j++) {
                for (int b = 0; b < r; b++) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
