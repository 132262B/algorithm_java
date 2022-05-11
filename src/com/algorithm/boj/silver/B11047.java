package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11047"/> 문제주소 </a>
 * BOJ / 11047 / 동전 0
 */
public class B11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int k = Integer.parseInt(str[0]);
        int sum = Integer.parseInt(str[1]);

        int[] coin = new int[k];
        while (k-- > 0) coin[k] = Integer.parseInt(br.readLine());

        int count = 0;
        int i = 0;
        do {

            if (coin[i] > sum) {
                i++;
            } else {
                sum = sum - coin[i];
                count++;
            }

        } while (sum != 0);
        System.out.println(count);

    }
}
