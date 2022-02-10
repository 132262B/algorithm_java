package com.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1546"/> 문제주소 </a>
 * 백준 / 1546 / 평균
 */
public class B1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Double[] arr = new Double[n];

        Double max = 0.0;
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        Double sum = 0.0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max * 100;

            sum += arr[i];
        }

        System.out.println(sum / n);

    }
}
