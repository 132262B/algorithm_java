package com.algorithm.baekjoon.bronze;


import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2884"/> 문제주소 </a>
 * 백준 / 2884 / 알람 시계
 */
public class B2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();

        mm -= 45;
        if (mm < 0) {
            mm += 60;
            hh -= 1;
            if (hh < 0)
                hh += 24;
        }

        sc.close();
        System.out.println(hh + " " + mm);

    }
}
