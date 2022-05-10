package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * @see <a href="https://www.acmicpc.net/problem/2217"/> 문제주소 </a>
 * BOJ / 2217 / 로프
 */
public class B2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(br.readLine());
            return;
        }

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;
        int rope = 1;
        for (int j = 0; j < n; j++) {
            result = Math.max(result, arr[j] * rope);
            rope++;
        }

        System.out.println(result);


    }
}
