package com.algorithm.baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/1110"/> 문제주소 </a>
 * 백준 / 1110 / 더하기 사이클
 */
public class B1110 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int temp = num;
        int cnt = 0;

        while(true) {
            int left = temp / 10;
            int right = temp % 10;

            temp = right * 10 + (left + right) % 10;
            cnt++;
            if(num == temp) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
