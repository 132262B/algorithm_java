package com.algorithm.baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/1032"/> 문제주소 </a>
 * 백준 / 1032 / 명령 프롬프트
 */
public class B1032 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        String[] str = new String[p];

        StringBuffer sb = new StringBuffer(sc.next());

        for (int i = 1; i < p; i++) {
            str[i] = sc.next();
        }
        sc.close();

        for (int j = 1; j < p; j++) {
            for (int l = 0; l < sb.length(); l++) {
                if (sb.charAt(l) != str[j].charAt(l))
                    sb.setCharAt(l, '?');
            }
        }
        System.out.println(sb);
    }
}