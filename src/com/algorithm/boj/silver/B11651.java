package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/11651"/> 문제주소 </a>
 * BOJ / 11651 / 좌표 정렬하기 2
 */
public class B11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            arr[i][1] = Integer.parseInt(str[0]);
            arr[i][0] = Integer.parseInt(str[1]);
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][1]).append(" ").append(arr[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}
