package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10871"/> 문제주소 </a>
 * BOJ / 10871 / X보다 작은 수
 */
public class B10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[1]);

        String[] a = br.readLine().split(" ");

        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i]) < x) System.out.print(a[i] + " ");
        }
    }
}