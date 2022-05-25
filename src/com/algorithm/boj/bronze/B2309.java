package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/2309"/> 문제주소 </a>
 * BOJ / 2309 / 일곱 난쟁이
 */
public class B2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        boolean yn = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    yn = true;
                    break;
                }
            }

            if(yn) {
                Arrays.sort(arr);
                for (int c = 2; c < 9; c++) {
                    System.out.println(arr[c]);
                }
                return;
            }
        }
    }

}
