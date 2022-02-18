package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2739"/> 문제주소 </a>
 * 백준 / 2739 / 구구단
 */
public class B2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=9; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
