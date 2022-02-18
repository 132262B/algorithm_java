package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2753"/> 문제주소 </a>
 * 백준 / 2753 / 윤년
 */
public class B2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        if (num % 4 == 0) {

            if (num % 400 == 0) System.out.println("1");
            else if (num % 100 == 0) System.out.println("0");
            else System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
