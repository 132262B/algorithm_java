package com.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1157"/> 문제주소 </a>
 * 백준 / 1157 / 단어 공부
 */
public class B1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] num = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < str.length(); i++) {
            int a = num[str.charAt(i) - 65]++;
            if (max < num[str.charAt(i) - 65]) {
                max = num[str.charAt(i) - 65];
                result = str.charAt(i);
            } else if (max == num[str.charAt(i) - 65]) {
                result = '?';
            }
        }
        System.out.println(result);

    }
}
