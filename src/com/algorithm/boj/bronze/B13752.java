package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/13752"/> 문제주소 </a>
 * BOJ / 13752 / 히스토그램
 */
public class B13752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++)
                sb.append("=");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
