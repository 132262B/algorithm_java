package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/5585"/> 문제주소 </a>
 * BOJ / 5585 / 거스름돈
 */
public class B5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;

        int[] arr = {500, 100, 50, 10, 5, 1};

        do {
            for (int i = 0; i < 6; i++) {
                if (money >= arr[i]) {
                    money = money - arr[i];
                    cnt++;
                    break;
                }
            }

        } while (money != 0);

        System.out.println(cnt);
    }
}
