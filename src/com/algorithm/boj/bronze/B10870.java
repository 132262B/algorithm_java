package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10870"/> 문제주소 </a>
 * 백준 / 10870 / 피보나치 수 5
 */
public class B10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) + 1;

        if(n > 1) {
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;

            for (int i = 2; i < n; i++)
                arr[i] = arr[i - 2] + arr[i - 1];

            System.out.println(arr[n - 1]);
        } else System.out.println(n-1);


    }
}
