package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/8393"/> 문제주소 </a>
 * BOJ / 8393 / 합
 */
public class B8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
