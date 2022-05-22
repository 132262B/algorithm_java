package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2869"/> 문제주소 </a>
 * BOJ / 2869 / 달팽이는 올라가고 싶다
 */
public class B2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);

        int num = 0;
        if((v-b) % (a-b) != 0) num++;
        System.out.println((v-b)/(a-b)+num);

    }
}
