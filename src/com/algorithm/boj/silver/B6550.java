package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/6550"/> 문제주소 </a>
 * BOJ / 6550 / 부분 문자열
 */
public class B6550 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = br.readLine();
            if (str == null) break;

            String[] arr = str.split(" ");
            st(arr[0], arr[1]);
        }

    }

    public static void st(String s, String t) {

        if (s.contains(t)) {
            System.out.println("Yes");
            return;
        } else {
            int j = 0;

            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(j) == t.charAt(i)) {
                    j++;
                }

                if (j == s.length()) {
                    System.out.println("Yes");
                    break;
                }
            }

            if (j != s.length()) System.out.println("No");
        }
    }
}
