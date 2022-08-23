package com.algorithm.boj.silver;

import java.io.*;
import java.util.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/10815"/> 문제주소 </a>
 * BOJ / 10815 / 숫자카드
 */
public class B10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] n_arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int a = 0; a < n; a++) n_arr[a] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuffer sb = new StringBuffer();
        Arrays.sort(n_arr);

        while (st.hasMoreTokens()) {
            int m_num = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                if (n_arr[i] == m_num) {
                    sb.append("1 ");
                    break;
                }

                if (i == n - 1) {
                    sb.append("0 ");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}