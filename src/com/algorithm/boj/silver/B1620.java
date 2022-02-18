package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1620"/> 문제주소 </a>
 * 백준 / 1620 / 나는야 포켓몬 마스터 이다솜
 */
public class B1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> poket = new HashMap<>();
        String[] arr = new String[n];

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            poket.put(str, i);
            arr[i - 1] = str;
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            int chr = str.charAt(0);
            if (chr >= 49 && chr <= 57) {
                sb.append(arr[Integer.parseInt(str) - 1]).append("\n");
            } else {
                sb.append(poket.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }

}
