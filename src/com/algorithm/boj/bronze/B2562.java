package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2562"/> 문제주소 </a>
 * 백준 / 2562 / 최댓값
 */
public class B2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int nn = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (max < n) {
                max = n;
                nn = i;
            }
        }

        System.out.println(max);
        System.out.println(nn+1);
    }
}
