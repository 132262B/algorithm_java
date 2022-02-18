package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2742"/> 문제주소 </a>
 * 백준 / 2742 / 기찍 N
 */
public class B2742 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
