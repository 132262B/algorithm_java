package com.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/1330"/> 문제주소 </a>
 * 백준 / 1330 / 두 수 비교하기
 */
public class B1330 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("==");
        } else {
            System.out.println((a>b) ? ">" : "<");
        }
    }
}
