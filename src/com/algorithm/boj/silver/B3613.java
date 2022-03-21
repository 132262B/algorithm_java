package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/3613"/> 문제주소 </a>
 * BOJ / 3613 / Java vs C++
 */
public class B3613 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();

        if (chars[0] == '_' || chars[chars.length - 1] == '_' || ('A' <= chars[0] && chars[0] <= 'Z')) {
            System.out.println("Error!");
            return;
        }

        boolean java = true;
        boolean c = true;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '_') {
                if (i > 1 && chars[i - 1] == '_') {
                    System.out.println("Error!");
                    return;
                }
                java = false;
            } else if ('A' <= chars[i] && chars[i] <= 'Z') c = false;
        }

        if (!java && !c) {
            System.out.println("Error!");
            return;
        }

        if (java && c) {
            System.out.println(str);
            return;
        }

        StringBuilder sb = new StringBuilder();

        if (java) {
            for (char chr : chars) {
                if ('A' <= chr && chr <= 'Z') sb.append('_').append((char) (chr + 32));
                else sb.append(chr);
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '_' && i < chars.length - 1) sb.append((char) (chars[++i] - 32));
                else sb.append(chars[i]);
            }
        }

        System.out.println(sb);
    }

}
