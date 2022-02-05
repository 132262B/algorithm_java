package com.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/2750"/> 문제주소 </a>
 * 백준 / 2750 / 수 정렬하기
 */
public class B2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
