package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2941"/> 문제주소 </a>
 * 백준 / 2941 / 크로아티아 알파벳
 */
public class B2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str + "..";
        int wordCnt = 0;
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length - 2; i++) {

            if (c[i] == 'c' && (c[i + 1] == '=' || c[i + 1] == '-')) {
                wordCnt++;
                i++;
            } else if (c[i] == 'd' && c[i + 1] == 'z' && c[i + 2] == '=') {
                wordCnt++;
                i = i + 2;
            } else if (c[i] == 'd' && c[i + 1] == '-') {
                wordCnt++;
                i++;
            } else if (c[i + 1] == 'j' && (c[i] == 'l' || c[i] == 'n')) {
                wordCnt++;
                i++;
            } else if (c[i + 1] == '=' && (c[i] == 's' || c[i] == 'z')) {
                wordCnt++;
                i++;
            } else {
                wordCnt++;
            }
        }

        System.out.println(wordCnt);
    }
}
