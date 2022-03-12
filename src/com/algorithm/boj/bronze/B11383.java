package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/11383"/> 문제주소 </a>
 * BOJ / 11383 / 뚊
 */
public class B11383 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] str = new String[n + n];

        int a = 0;
        for (int i = 0; i < n + n; i++) {
            str[i] = br.readLine();
        }

        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int l = 0; l < m; l++) {
                sb.append(str[j].charAt(l)).append(str[j].charAt(l));
            }

            if (!str[n + j].equals(sb.toString())) {
                System.out.println("Not Eyfa");
                a = 1;
                break;
            }
        }

        if (a == 0)
            System.out.println("Eyfa");

    }
}
