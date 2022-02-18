package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/18108"/> 문제주소 </a>
 * 백준 / 18108 / 1998년생인 내가 태국에서는 2541년생?!
 */
public class B18108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num-543);
    }
}
