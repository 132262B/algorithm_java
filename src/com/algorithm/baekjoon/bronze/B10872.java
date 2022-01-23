package com.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10872"/> 문제주소 </a>
 * 백준 / 10872 / 팩토리얼 (재귀 기초)
 */
public class B10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(fac(num));
    }

    public static int fac(int num) {
        if (num <= 1) return 1;
        else return fac(num - 1) * num;
    }
}
