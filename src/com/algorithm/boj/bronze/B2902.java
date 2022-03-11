package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2902"/> 문제주소 </a>
 * BOJ / 2902 / KMP는 왜 KMP일까?
 */
public class B2902 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken().charAt(0));
        }

    }
}
