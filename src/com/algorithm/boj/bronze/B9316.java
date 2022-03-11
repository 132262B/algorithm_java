package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/9316"/> 문제주소 </a>
 * BOJ / 9316 / Hello Judge
 */
public class B9316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello World, Judge " + (i + 1) + "!");
        }
    }
}
