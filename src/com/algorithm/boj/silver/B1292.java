package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1302"/> 문제주소 </a>
 * BOJ / 1292 / 쉽게 푸는 문제
 */
public class B1292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        int[] arr = new int[1002];
        int count = 1;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count == 1001) break;
                arr[count] = i;
                count++;
            }
        }

        int sum = 0;
        for (int i = A; i <= B; i++)
            sum += arr[i];

        System.out.println(sum);
    }
}
