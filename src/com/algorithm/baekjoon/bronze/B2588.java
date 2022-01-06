package com.algorithm.baekjoon.bronze;


import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2588"/> 문제주소 </a>
 * 백준 / 2588 / 곱셈
 */
public class B2588 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();

        System.out.println(num1 * Integer.parseInt(num2.substring(2, 3)));
        System.out.println(num1 * Integer.parseInt(num2.substring(1, 2)));
        System.out.println(num1 * Integer.parseInt(num2.substring(0, 1)));
        System.out.println(num1 * Integer.parseInt(num2));

    }
}
