package com.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/4101"/> 문제주소 </a>
 * 백준 / 4101 / 크냐?
 */
public class B4101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean f = true;

        while (f) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 == 0 && num2 == 0) {
                f = false;
            } else {
                if(num1>num2) System.out.println("Yes");
                else System.out.println("No");
            }

        }
    }
}
