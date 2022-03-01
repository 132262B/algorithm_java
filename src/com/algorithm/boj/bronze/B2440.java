package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2440"/> 문제주소 </a>
 * 백준 / 2440 / 별 찍기 - 3
 */
public class B2440 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int m = n;
        for (int i = 0; i < n; i++) {
            for (int j = m; j > 0; j--)
                sb.append("*");
            sb.append("\n");
            m--;
        }
        System.out.println(sb);
    }
}
