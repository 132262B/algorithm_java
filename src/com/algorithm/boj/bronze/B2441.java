package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2441"/> 문제주소 </a>
 * 백준 / 2441 / 별 찍기 - 4
 */
public class B2441 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int m = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                sb.append(" ");
            for (int j = m; j > 0; j--)
                sb.append("*");

            sb.append("\n");
            m--;
        }
        System.out.println(sb);
    }
}
