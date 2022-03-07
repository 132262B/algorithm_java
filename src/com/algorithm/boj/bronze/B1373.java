package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1373"/> 문제주소 </a>
 * BOJ / 1373 / 2진수 8진수
 */
public class B1373 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        int size = str.length();
        if (size % 3 == 2) str = "0" + str;
        if (size % 3 == 1) str = "00" + str;
        int a = 0;
        int b = 0;
        int c;
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = str.charAt(i) - '0';
            if (i % 3 == 2) a = num;
            else if (i % 3 == 1) b = num * 2;
            else if (i % 3 == 0) {
                c = num * 4;
                sb.append(a + b + c);
            }
        }
        System.out.println(sb.reverse());
    }
}
