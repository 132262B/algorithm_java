package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/17072"/> 문제주소 </a>
 * BOJ / 17072 / 아스키 아트
 */
public class B17072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int r = Integer.parseInt(st.nextToken()) * 2126;
                int g = Integer.parseInt(st.nextToken()) * 7152;
                int b = Integer.parseInt(st.nextToken()) * 722;
                int result = r + g + b;
                sb.append(asciiResult(result));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static String asciiResult(int k) {
        if (k >= 2040000) return ".";
        else if (k >= 1530000) return "-";
        else if (k >= 1020000) return "+";
        else if (k >= 510000) return "o";
        else return "#";
    }
}
