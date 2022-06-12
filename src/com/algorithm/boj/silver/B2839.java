package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2839"/> 문제주소 </a>
 * BOJ / 2839 / 설탕 배달
 */
public class B2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                n -= 5;
                count++;
            } else if (n % 3 == 0) {
                n -= 3;
                count++;
            } else if (n > 5) {
                n -= 5;
                count++;
            } else {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}
