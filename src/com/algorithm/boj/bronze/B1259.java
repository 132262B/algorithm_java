package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1259"/> 문제주소 </a>
 * 백준 / 1259 / 팰린드롬수
 */
public class B1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        a: while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    sb.append("no").append("\n");
                    continue a;
                }
            }
            sb.append("yes").append("\n");
        }

        System.out.println(sb);
    }
}
