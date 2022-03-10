package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/11652"/> 문제주소 </a>
 * BOJ / 11652 / 카드
 */
public class B11652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);

        int cnt = 1;
        int max = 1;
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) cnt++;
            else cnt = 1;

            if (cnt > max) {
                max = cnt;
                maxIdx = i;
            }
        }
        System.out.println(arr[maxIdx]);
    }
}
