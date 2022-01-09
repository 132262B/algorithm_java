package com.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2741"/> 문제주소 </a>
 * 백준 / 2741 / N 찍기
 */
public class B2741 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            System.out.println(i);
        }
    }
}
