package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2502"/> 문제주소 </a>
 * BOJ / 2502 / 떡 먹는 호랑이
 */
public class B2502 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int day = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int[] arr = new int[day + 1];
        for (int i = 1; i <= k / 2; i++) {
            for (int j = i + 1; j < k; j++) {
                arr[0] = i;
                arr[1] = j;

                for (int a = 2; a < day; a++) {
                    arr[a] = arr[a - 1] + arr[a - 2];
                }

                if (arr[day - 1] == k) {
                    System.out.println(arr[0]);
                    System.out.println(arr[1]);
                    return;
                }
            }
        }
    }
}
