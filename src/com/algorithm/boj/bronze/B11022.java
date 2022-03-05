package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11022"/> 문제주소 </a>
 * 백준 / 11022 / A+B - 8
 */
public class B11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            sb.append("Case #").append(i + 1).append(":").append(" ").append(a).append(" + ").append(b).append(" = " + (a + b)).append("\n");
        }

        System.out.println(sb);
    }
}
