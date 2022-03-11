package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10798"/> 문제주소 </a>
 * BOJ / 10798 / 세로읽기
 */
public class B10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str = new String[5][15];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            String[] sp = br.readLine().split("");
            for (int j = 0; j < sp.length; j++) {
                str[i][j] = sp[j];
            }
        }

        for (int f = 0; f < 15; f++) {
            for (int s = 0; s < 5; s++) {
                if (str[s][f] != null) sb.append(str[s][f]);
            }
        }

        System.out.println(sb.toString().replaceAll(" ", ""));
    }
}
