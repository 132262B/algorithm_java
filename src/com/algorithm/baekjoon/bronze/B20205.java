package com.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/20205"/> 문제주소 </a>
 * 백준 / 20205 / 교수님 그림이 깨지는데요?
 *
 * 실패 추후 다시 도전
 */
public class B20205 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int q = 0; q < n; q++) {
                    for (int w = 0; w < k; w++) {
                        System.out.print(arr[i][q] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}