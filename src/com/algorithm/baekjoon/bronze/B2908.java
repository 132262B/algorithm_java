package com.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2908"/> 문제주소 </a>
 * 백준 / 2908 / 상수
 */
public class B2908 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = reverse(sc.nextInt());
        int num2 = reverse(sc.nextInt());

        System.out.println(num1>num2?num1:num2);
    }


    public static int reverse(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse;
    }
}
