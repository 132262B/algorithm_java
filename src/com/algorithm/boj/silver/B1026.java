package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * @see <a href="https://www.acmicpc.net/problem/1026"/> 문제주소 </a>
 * BOJ / 1026 / 보물
 */
public class B1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] a_arr = br.readLine().split(" ");
        String[] b_arr = br.readLine().split(" ");

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(a_arr[i]);
            b[i] = Integer.parseInt(b_arr[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int result = 0;
        for (int j = 0; j < n; j++) {
            result += a[j] * b[j];
        }

        System.out.println(result);

    }

}
