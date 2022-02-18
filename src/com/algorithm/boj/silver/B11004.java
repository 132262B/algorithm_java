package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/11004"/> 문제주소 </a>
 * 백준 / 11004 / K번째 수
 */
public class B11004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()) - 1;

        int[] arr = new int[a];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr[k]);
    }
}
