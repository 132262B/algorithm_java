package com.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/5800"/> 문제주소 </a>
 * 백준 / 5800 / 성적 통계
 */
public class B5800 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            int gap = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            for (int j = 0; j < n - 1; j++) {
                gap = Math.max(gap, arr[j + 1] - arr[j]);
            }

            System.out.println("Class " + (i + 1));
            System.out.println("Max " + arr[n - 1] + ", Min " + arr[0] + ", Largest gap " + gap);
        }
    }
}