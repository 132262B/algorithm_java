package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/10989"/> 문제주소 </a>
 * 백준 / 10989 / 수 정렬하기 3
 */
public class B10989 {

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
            sb.append(i + "\n");
        }

        System.out.println(sb);

    }
}
