package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2439"/> 문제주소 </a>
 * 백준 / 2439 / 별 찍기 - 2
 */
public class B2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
